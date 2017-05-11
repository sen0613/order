package kr.re.kitri.service;
import kr.re.kitri.model.Order;
import kr.re.kitri.util.OrderConstants;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderService {


    public List<Order> getOrderList() {
        List<Order> list = new ArrayList();
        Order order;
        try {
            Class.forName(OrderConstants.DRIVER_POSTGRES);
            System.out.println("Driver ok..");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query = "select a.cust_id, a.username, a.address, a.email, b.order_date, b.prd_name\n" +
                "from customer a, orders b\n" +
                "where a.cust_id = b.cust_id";

        try {
            Connection conn = DriverManager.
                    getConnection(OrderConstants.DB_URL,OrderConstants.USERNAME,OrderConstants.PASSWORD);
            System.out.println("login ok..");
            PreparedStatement a =  conn.prepareStatement(query);
            ResultSet rs = a.executeQuery();

            while(rs.next()){
                order = new Order(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getTimestamp(5).toLocalDateTime().toLocalDate(),
                        rs.getString(6)
                );
                list.add(order);
            }
            conn.close();
            System.out.println("system out..");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;



    }
}