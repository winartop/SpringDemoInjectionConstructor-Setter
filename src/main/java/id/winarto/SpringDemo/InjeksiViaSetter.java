package id.winarto.SpringDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InjeksiViaSetter{

    //panggil interfacenya
    private HalloSpringService halloSpringService;

    @Autowired
    //Setternya
    public void setHalloSpringService(HalloSpringService halloSpringService) {
        this.halloSpringService = halloSpringService;
    }

    public void getMessage(){
        halloSpringService.sayHallo();
    }
}
