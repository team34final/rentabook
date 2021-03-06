
package rentalbook.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="Delivery", url="http://Delivery:8080")
public interface Service {

    @RequestMapping(method= RequestMethod.GET, path="/")
    public void deliverySaving(@RequestBody  );

}