package com.example.demo.bootstrap;
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inhousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, InhousePartRepository inhousePartRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inhousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */


        Set<Product> sampleProducts = new HashSet<Product>();
        Set<Part> sampleParts = new HashSet<>();

        //adds sample plushie product to the database
        Product plushie1 = new Product(1, "Plushie 1", 20.0, 7);
        Product plushie2 = new Product(2, "Plushie 2", 15.0, 8);
        Product plushie3 = new Product(3, "Plushie 3", 13.0, 7);
        Product plushie4 = new Product(4, "Plushie 4", 12.0, 9);
        Product plushie5 = new Product(5, "Plushie 5", 10.0, 10);

        sampleProducts.add(plushie1);
        sampleProducts.add(plushie2);
        sampleProducts.add(plushie3);
        sampleProducts.add(plushie4);
        sampleProducts.add(plushie5);

        System.out.println("Set: " + sampleProducts);


        //adds sample Parts to the db ***CHANGE TO REFLECT YOUR STUFF***
        InhousePart bag1 = new InhousePart();
        bag1.setId(1);
        bag1.setName("Bag1");
        bag1.setPrice(249.99);
        bag1.setInv(25);
        bag1.setMinInv(1);
        bag1.setMaxInv(100);

        InhousePart bag2 = new InhousePart();
        bag2.setId(2);
        bag2.setName("Bag2");
        bag2.setPrice(249.99);
        bag2.setInv(25);
        bag2.setMinInv(1);
        bag2.setMaxInv(100);

        InhousePart bag3 = new InhousePart();
        bag3.setId(3);
        bag3.setName("Bag3");
        bag3.setPrice(249.99);
        bag3.setInv(25);
        bag3.setMinInv(1);
        bag3.setMaxInv(100);


        InhousePart bag4 = new InhousePart();
        bag4.setId(4);
        bag4.setName("Bag4");
        bag4.setPrice(249.99);
        bag4.setInv(25);
        bag4.setMinInv(1);
        bag4.setMaxInv(100);

        InhousePart bag5 = new InhousePart();
        bag5.setId(5);
        bag5.setName("Bag5");
        bag5.setPrice(249.99);
        bag5.setInv(25);
        bag5.setMinInv(1);
        bag5.setMaxInv(100);

        sampleParts.add(bag1);
        sampleParts.add(bag2);
        sampleParts.add(bag3);
        sampleParts.add(bag4);
        sampleParts.add(bag5);

        //if there are no Parts or Products in the db, add sample data
        if (partRepository.count() == 0 && productRepository.count() == 0) {
            for (Product product : sampleProducts) {
                productRepository.save(product);
            }

            for (Part part : sampleParts) {
                partRepository.save(part);
            }
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());
    }
}
