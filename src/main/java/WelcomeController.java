import configuration.BasicConfiguration;
import org.apache.catalina.loader.WebappLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @Autowired
    private BasicConfiguration configuration;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();

    }
    @RequestMapping("/dynamic-configuration")
    public Map<String, Object> dynamicConfiguration() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("value", configuration.isValue());
        return map;
    }
}
