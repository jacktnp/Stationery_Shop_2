package stationery.stationery_shop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableAutoConfiguration

public class myshopController {
	elephant elephant = new elephant();
	faber_castell faber_castell = new faber_castell();
	horse horse = new horse();
	sakura sakura = new sakura();
	
	@RequestMapping("/myshop/elephant")
    public String elephant(){
        return "ยี่ห้อ : " + elephant.getBrand() + "สี : "+ elephant.getColor() + " ราคา : " + elephant.getPrice(); 
    }
	@RequestMapping("/myshop/faber_castell")
    public String faber_castell(){
        return "ยี่ห้อ : " + faber_castell.getBrand() + "สี : "+ faber_castell.getColor() + " ราคา : " + faber_castell.getPrice(); 
    }
	@RequestMapping("/myshop/horse")
    public String horse(){
        return "ยี่ห้อ : " + horse.getBrand() + "สี : "+ horse.getColor() + " ราคา : " + horse.getPrice(); 
    }
	@RequestMapping("/myshop/sakura")
    public String sakura(){
        return "ยี่ห้อ : " + sakura.getBrand() + "สี : "+ sakura.getColor() + " ราคา : " + sakura.getPrice(); 
    }

	/* */
	public static void fileWriter() {
		try {
			FileWriter w = new FileWriter("brand.txt");
			w.write("0");
			w.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	public static void fileReader() {
		try {
			int data;
			while((data = new FileReader("brand.txt").read()) != -1) {
				System.out.printf("%c\n", data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(myshopController.class, args);
		fileReader();
	}
	/* */
}
