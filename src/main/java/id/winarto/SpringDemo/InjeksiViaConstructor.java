package id.winarto.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjeksiViaConstructor {
    //inject via custructor

    //menggunakan method custractor
    private HalloSpringService halloSpringService;

    //custructrnya
    @Autowired
    public InjeksiViaConstructor(HalloSpringService halloSpringService) {
        this.halloSpringService = halloSpringService;
    }
    //Constructornya

    public void getMessage(){
        halloSpringService.sayHallo();
    }
}
