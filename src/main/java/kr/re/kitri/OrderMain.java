package kr.re.kitri;
import kr.re.kitri.model.Order;
import kr.re.kitri.service.OrderService;
import java.util.List;

/**
 * Created by danawacomputer on 2017-05-11.
 */
public class OrderMain {

    public static void main(String[] args) {
        OrderService service = new OrderService();
        List<Order> list = service.getOrderList();
        for(Order e : list) {
            System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n",
                    e.getCustId(), e.getUsername(), e.getAddress(),
                    e.getEmail(), e.getOrderDate(), e.getPrdName());

            //list.forEach(System.out::println);
        }
    }
}