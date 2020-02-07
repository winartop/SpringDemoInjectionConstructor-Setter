package id.winarto.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

		//untuk memanggil controller pada getBean yang dipanggil adalah nama classnya
		InjeksiViaConstructor injeksiViaConstructor = (InjeksiViaConstructor) context.getBean("injeksiViaConstructor");

		//untuk mencetak pesan yang ada di implementasi
		injeksiViaConstructor.getMessage();
		System.out.println("Hallo, ini ijeksi menggunakan constructor method");
		System.out.println("=========================================================================");
		//contoh pemanggilan injeksi via Constructor method
		//========================================================================================


		// contoh pemanggilan injeksi via setter method
		InjeksiViaSetter injeksiViaSetter = (InjeksiViaSetter) context.getBean("injeksiViaSetter");
		injeksiViaSetter.getMessage();
		System.out.println("Hallo, ini ijeksi menggunakan setter method");
		System.out.println("==========================================================================");


	}


}
