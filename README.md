## D287 JAVA FRAMEWORKS: Read Me
**Scenario**: You are working for a company that licenses and customizes a software application to keep track of inventory in stores. Your job as a software developer is to customize this application to meet a specific customer’s needs.

For my project, I have designed a fictional company based on a small business owned by a friend of mine. She makes handmade crocheted items. I'm proud of her hard work to build her business, so I dedicate this project to her.
### TASK INSTRUCTIONS PROVIDED FOR REFERENCE
Each note should include the prompt, file name, line number, and change.

## TRACKED CHANGES
**C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.**

_filename: mainscreen.html_

ADDED content to demo.css for CSS styling of page.
```
    
.header-with-logo {
    display: flex;
    align-items: center;
    margin-bottom: 20px;
}

.header-with-logo .logo {
    height: 60px;
    width: auto;
    margin-right: 15px;
}

.dropdown-menu {
    border-radius: 10px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
}

.dropdown {
    margin-top: 40px;
}

.custom-search {
    max-width: 1000px;
    border: 1px solid #0d6efd;
    padding: 0.375rem 0.75rem;
    color: #0d6efd;
    box-shadow: none;
    margin-top: 40px;
}

.custom-search:focus {
    border-color: #0d6efd;
    outline: 0;
    box-shadow: 0 0 0 0.2rem rgba(13, 110, 253, 0.25); /* Bootstrap blue shadow */
}

.row-links {
    margin-bottom: 20px;
}

hr {
    margin: 0;
}

.about-page-body {
    margin: 0 auto;
    max-width: 800px;
    text-align: center;
}

h3 {
    text-align: center;
}

.about-page-link {
    text-decoration: underline;
}




```

line 14: changed shop name to Kawaii Baby

```

<title>Kawaii Baby</title>
```

line 23: added a Logo, drop down menu, and search bar

```
    <!-- Top Row: Logo, Dropdown, Search -->
    <div class="row align-items-center mb-0">

        <div class="col-auto"> <!-- Image -->
            <img src="../Images/Kawaii%20baby%20logo.png" alt="Kawaii Logo" class="logo" height="100" width="100">
        </div>

        <div class="col-auto"> <!-- Button -->
            <button class="btn btn-primary dropdown-toggle rounded-pill dropdown" type="button" data-bs-toggle="dropdown">
                Actions
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">View</a></li>
                <li><a class="dropdown-item" href="#">Edit</a></li>
                <li><a class="dropdown-item" href="#">Delete</a></li>
            </ul>
        </div>

        <div class="col"> <!-- Search bar -->
            <input type="text" class="form-control rounded-pill custom-search" placeholder="Search...">
        </div>

    </div>

```

line 47: Added smaller affiliate links under search bar
```
    <!-- New Row: Links -->
    <div class="row mb-0 row-links">
        <div class="col d-flex justify-content-center gap-3 mb-3">
            <a href="#" class="btn"><strong>Deals from small shops</strong></a>
            <a href="#" class="btn"><strong>Home Favorites</strong></a>
            <a href="#" class="btn"><strong>Fashion Finds</strong></a>
            <a href="#" class="btn"><strong>Registry</strong></a>
            <a href="#" class="btn"><strong>Gift Cards</strong></a>
        </div>
    </div>
```

Line 60: Changed header to Handmade with image links to handmade products (links dont work theyre just for show)
```
    <div class="container"> <!--image grid -->
        <div class="row row-cols-5 g-3">
            <div class="col"><a href="#"><img th:src="@{/images/Kawaii1.png}" class="img-fluid" alt="Image 1"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaii3.png}" class="img-fluid" alt="Image 2"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaii7.png}" class="img-fluid" alt="Image 3"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaii8.png}" class="img-fluid" alt="Image 4"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaii11.png}" class="img-fluid" alt="Image 5"></a></div>
        </div>
    </div>

```
Line 72: Changed header to Crochet Bags with image links to handmade products (links dont work theyre just for show)
```
    <div class="container">
        <div class="row row-cols-5 g-3">
            <div class="col"><a href="#"><img th:src="@{/images/Kawaiibag1.png}" class="img-fluid" alt="Image 1"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaiibag2.png}" class="img-fluid" alt="Image 2"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaiibag3.png}" class="img-fluid" alt="Image 3"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaiibag4.png}" class="img-fluid" alt="Image 4"></a></div>
            <div class="col"><a href="#"><img th:src="@{/images/Kawaiibag5.png}" class="img-fluid" alt="Image 5"></a></div>
        </div>
    </div>
```

*******************

**D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers
and include navigation to and from the “About” page and the main screen.**

_filename: mainscreen.html_

line 157: added link to about page at the bottom of page

```
    <h3>What is Kawaii Baby</h3>

    <div class="d-flex justify-content-center">
        <a th:href="@{/aboutPage}" class="btn about-page-link"><strong>Kawaii Baby about page</strong></a>
    </div>
```

_filename: MainScreenController.java_

lines 56-57: added controller @GetMapping to enable access to About page.
```
@GetMapping("/aboutPage")
    public String showAboutPage() {
        return "aboutPage";  // make sure aboutPage.html is in templates folder
    }
```

_filename: aboutPage.html_

lines 1 - 84: added new aboutPAge.html page.

```
<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="../static/css/demo.css">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>About Us – Kawaii Baby</title>
  <style>
    body { font-family: Arial, sans-serif; line-height: 1.6; color: #333;;}
    header { text-align: center; margin-bottom: 40px; }
    .section { max-width: 800px; margin: 0 auto 40px; }
    h1, h2 { color: #2a6f97; }
    ul { list-style-type: disc; margin-left: 20px; }
  </style>
</head>
<body>
<header>
  <h1>About Kawaii Baby</h1>
  <p>Handcrafted with love: plushies & bags made just for you 🧶</p>
</header>

<section class="section">
  <h2>Our Story</h2>
  <p>
    Welcome to <strong>Kawaii Baby</strong>—a small, family‑run shop
    founded in 2015, born from a passion for crochet and handmade crafts.
    Inspired by warm memories of crafting with loved ones, we create each
    plushie and bag stitch by stitch, pouring creativity, care, and joy
    into every item.
  </p>
</section>

<section class="section">
  <h2>What We Offer</h2>
  <p>Discover our handcrafted creations, including:</p>
  <ul>
    <li>Amigurumi plushies – cute, cuddly characters in a variety of sizes</li>
    <li>Hand‑crocheted bags – roomy totes, charming crossbody bags, and pouches</li>
    <li>Custom designs – personalize colors, sizes, or characters to bring your vision to life</li>
  </ul>
</section>

<section class="section">
  <h2>Our Promise</h2>
  <ul>
    <li><strong>Quality Craftsmanship</strong>: Every detail is carefully finished, using high‑quality yarn and fillings.</li>
    <li><strong>Handmade with Heart</strong>: Our creations are unique—no item is mass‑produced.</li>
    <li><strong>Customer Delight</strong>: We listen, adjust, and design to ensure each purchase brings a smile.</li>
    <li><strong>Sustainable Practices</strong>: We use eco‑friendly packaging and materials wherever possible.</li>
  </ul>
</section>

<section class="section">
  <h2>Meet the Maker</h2>
  <p>
    Hi! I’m <strong>Mia</strong>, the hands and heart behind
    Kawaii Baby. I’ve been crocheting since [Year or personal note]
    and find joy in transforming yarn into lovable companions and stylish
    accessories. Every stitch carries my passion—and yours.
  </p>
</section>

<section class="section">
  <h2>Get in Touch</h2>
  <p>
    Whether you're curious about a custom order, need help choosing the
    perfect design, or just want to say hello—we’d love to hear from you!
  </p>
  <p>
    Email us at: <a href="mailto:hello@yourstorename.com">hello@notarealstorename.com</a><br>
    Follow us on Instagram: <a href="https://instagram.com/yourhandle">@notrealhandle</a>
  </p>
</section>

<footer style="text-align:center; margin-top:60px; font-size:0.9em; color:#666;">
  <p>&copy; <span id="year"></span> Kawaii Baby. All rights reserved.</p>
</footer>

<script>
  document.getElementById('year').textContent = new Date().getFullYear();
</script>
</body>
</html>

```

***********************

**E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts
and five products in your sample inventory and should not overwrite existing data in the database.**

_filename: BootStrapData.java_

added code to public BootStrapData class to fill in part repository

lines 27-39 - insertion of new repo for inhouse parts
```
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

```
lines 41-134 - added new parts to the repository

```
@Override
    public void run(String... args) throws Exception {
        
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for (OutsourcedPart part : outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }
        
        Set<Product> sampleProducts = new HashSet<Product>();
        Set<Part> sampleParts = new HashSet<>();

        //adds sample plushie product to the database
        Product plushie1 = new Product(1, "Plushie Bunny", 20.0, 7);
        Product plushie2 = new Product(2, "Plushie Kirby", 15.0, 8);
        Product plushie3 = new Product(3, "Plushie Purple Bunny", 13.0, 7);
        Product plushie4 = new Product(4, "Plushie Chopper", 12.0, 9);
        Product plushie5 = new Product(5, "Plushie Totoro", 10.0, 10);

        sampleProducts.add(plushie1);
        sampleProducts.add(plushie2);
        sampleProducts.add(plushie3);
        sampleProducts.add(plushie4);
        sampleProducts.add(plushie5);

        System.out.println("Set: " + sampleProducts);


        //adds sample Parts to the db
        InhousePart bag1 = new InhousePart();
        bag1.setId(1);
        bag1.setName("Yellow Shell Bag");
        bag1.setPrice(249.99);
        bag1.setInv(25);
        bag1.setMinInv(1);
        bag1.setMaxInv(100);

        InhousePart bag2 = new InhousePart();
        bag2.setId(2);
        bag2.setName("Crochet Ferrari Bag");
        bag2.setPrice(249.99);
        bag2.setInv(25);
        bag2.setMinInv(1);
        bag2.setMaxInv(100);

        InhousePart bag3 = new InhousePart();
        bag3.setId(3);
        bag3.setName("Dove Bag");
        bag3.setPrice(249.99);
        bag3.setInv(25);
        bag3.setMinInv(1);
        bag3.setMaxInv(100);


        InhousePart bag4 = new InhousePart();
        bag4.setId(4);
        bag4.setName("Crochet Dior Tote Bag");
        bag4.setPrice(249.99);
        bag4.setInv(25);
        bag4.setMinInv(1);
        bag4.setMaxInv(100);

        InhousePart bag5 = new InhousePart();
        bag5.setId(5);
        bag5.setName("Cherry Bag");
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
```


*****************************
**F.  Add a “Buy Now” button to your product list.**

_filename: mainscreen.html_

Line 149: added this line to create Buy Now button next to Product Add/Delete interface

```
<a th:href="@{/buyProduct(productID=${tempProduct.id})}" class="btn btn-primary btn-sm mb-3">Buy Now</a>
```

**3 NEW FILES CREATED**

NEW _filename: BuyProductController.java_

lines 1-37: new Controller for "Buy Product" button on mainscreen.html:

This code creates a **buyProduct** method to check whether the buyer's selection is currently in stock.
if in stock, will return confirmation page that purchase was successful (BuyIsSuccess.html)
If out of stock or other error, return an error page so the customer knows (BuyIsFailure.html)

```
package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        Optional<Product> productToBuy = productRepository.findById(theId);

        if (productToBuy.isPresent()) {    //check if product in catalog
            Product product = productToBuy.get();

            if (product.getInv() > 0) {    //check if product still in stock
                product.setInv(product.getInv() - 1);   //decrement stock
                productRepository.save(product);    //save to product database

                return "BuyIsSuccess";   //successful purchase
            } else {
                return "/BuyIsFailure";   //purchase failed: out of stock
            }
        } else {
            return "/BuyIsFailure";  //purchase failed: product not found
        }
    }
}


```

NEW _filename: BuyIsSuccess.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase was successful" and thanks in response to successful purchase of product.

```
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Purchase Successful</title>
</head>
<body>
<h1>Your purchase was successful. We hope you enjoy your Crocheted Items! Thanks for shopping with us!</h1>

//<a href="http://localhost:8080/">Link
  to Main Screen</a>
</body>
</html>
```

NEW _filename: BuyIsFailure.html_ [in Templates folder]

lines 1-13: new code which displays "Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance."

```
<!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Failure to complete purchase</title>
        </head>
        <body>
            <h1>Your purchase did not succeed. Product may be out of stock. Please try again or contact us for assistance.</h1>
            
            <a href="http://localhost:8080/">Link
            to Main Screen</a>
        </body>
    </html>
```

*******************

**G.  Modify the parts to track maximum and minimum inventory**:

**•  Add additional fields to the part entity for maximum and minimum inventory.**

MODIFIED _filename: Part.java_

lines 34-38: inserted 2 new variables (minInv, maxInv) using @Min annotation for minInv and maxInv

```
  @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv;
    @Min(value = 0, message = "Maximum inventory must be positive")
    @Max(value = 200, message = "Maximum inventory value must fall within set maximum")
    int maxInv;

```

lines 48-53 and 56-62: added a default minimum inventory and max inventory values (0,100) to both default contructors

```
public Part(String name, double price, int inv) {
    this.name = name;
    this.price = price;
    this.inv = inv;
    this.minInv = 0; //default minimum inventory = 0;
    this.maxInv = 100; //default minimum inventory = 100;
}
```

lines 105-117: created 4 new getter and setter methods to get and set both minInv and maxInv

```
    public int getMinInv() { return minInv; }

    public void setMinInv(int minInv) { this.minInv = minInv }

    public int getMaxInv() { return maxInv; }

    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }

```

_filename: InhousePart.java_

lines 18-19: added values for min & max inventory to make sure a default is set

```
    public InhousePart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

_filename: OutsourcedPart.java_

lines 17-20: added values for min & max inventory to make sure a default is set

```
    public OutsourcedPart() {
        this.minInv = 0;
        this.maxInv = 100;
    }
```

**Additional Optional Change**

_filename: mainscreen.html_

lines 97-105: added table headers for Minimum Inventory and Maximum Inventory to display these in the table

```
     <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Inventory</th>
            <th>Min Inv</th>
            <th>Max Inv</th>
            <th>Action</th>

        </tr>
```

Line112: added table rows (td) for min inv and max inv

```
        <td th:text="${tempPart.minInv}">1</td>
        <td th:text="${tempPart.maxInv}">1</td>
```

**•  Modify the sample inventory to include the maximum and minimum fields.**

_filename: BootStrapData.java_

Added this code to EACH of the 5 products (see full quoted code above for confirmation)
on lines 74-109:
```
          //adds sample Parts to the db
        InhousePart bag1 = new InhousePart();
        bag1.setId(1);
        bag1.setName("Yellow Shell Bag");
        bag1.setPrice(249.99);
        bag1.setInv(25);
        bag1.setMinInv(1);
        bag1.setMaxInv(100);

        InhousePart bag2 = new InhousePart();
        bag2.setId(2);
        bag2.setName("Crochet Ferrari Bag");
        bag2.setPrice(249.99);
        bag2.setInv(25);
        bag2.setMinInv(1);
        bag2.setMaxInv(100);

        InhousePart bag3 = new InhousePart();
        bag3.setId(3);
        bag3.setName("Dove Bag");
        bag3.setPrice(249.99);
        bag3.setInv(25);
        bag3.setMinInv(1);
        bag3.setMaxInv(100);


        InhousePart bag4 = new InhousePart();
        bag4.setId(4);
        bag4.setName("Crochet Dior Tote Bag");
        bag4.setPrice(249.99);
        bag4.setInv(25);
        bag4.setMinInv(1);
        bag4.setMaxInv(100);

        InhousePart bag5 = new InhousePart();
        bag5.setId(5);
        bag5.setName("Cherry Bag");
        bag5.setPrice(249.99);
        bag5.setInv(25);
        bag5.setMinInv(1);
        bag5.setMaxInv(100);

```


**•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs**

_filename: InhousePartForm.html_

lines 24-28: added 2 fields for entering minimum & maximum inventory thresholds to this form

```
    <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>
```

_filename: OutsourcedPartForm.html_

lines 25-29: added 2 entry fields to this web form to enable user to enter min & max inventory limits

```
  <p><input type="text" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error</p>

    <p><input type="text" th:field="*{maxInv}" placeholder="Maximum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Maximum Inventory Error</p>
```

**•  Rename the file the persistent storage is saved to.**

MODIFY _filename: application.properties_

changed the location of the persistent database file to "spring-boot-h2-database-file"

```
spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-database-file
```


**•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.**

Made changes to the following files to validate numbers entered for min / max inventory:

_filename: Part.java_

ADD lines 135-141: created **validateLimits()** method for Part class

This new method ensures that no inventory value can fall below or rise above the set minimum/maximum values.

Further validators will be added in part H.

```
    public void validateLimits() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        } 
        else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }
```

_filename: PartServiceImpl.java

ADD line 57: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: InhousePartServiceImpl.java_

ADD line 52: call validateLimits method as part of the save method

```
    @Override
    public void save(InhousePart thePart) {
        thePart.validateLimits();
        partRepository.save(thePart);
    }
```

_filename: OutsourcedPartServiceImpl.java_

ADD line 57: call validateLimits method as part of the save method

```
    @Override
    public void save(OutsourcedPart thePart) {
        **thePart.validateLimits();**
        partRepository.save(thePart);
    }
```

*****************************

**H.  Add validation between or at the maximum and minimum fields.**

**•  Display error messages for low inventory when adding and updating PARTS if the inventory is less than the minimum number of parts.**

**•  Display error messages for low inventory when adding and updating PRODUCTS lowers the part inventory below the minimum.**

New Validator for Minimum inventory:

added custom error message for minimum inventory when updating parts which are used in products.
"Part count falls below set minimum"

2 NEW files:
_filename: ValidMinimum.java_ lines 1-23

```
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinimum {
    String message() default "Part count falls below set minimum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```
_filename: MinimumValidator.java_   lines 1-31

```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MinimumValidator implements ConstraintValidator<ValidMinimum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }

}

```
MODIFING domain model class files to apply minimum validator

_filename: Part.java_   line 4

```
import.com.example.demo.validators.PartsValidMinimum;
...
line 21: @ValidMinimum
```

Edited validator for Products, _EnufPartsValidator_ to enforce minimum inventory:

MODIFY _filename: EnufPartsValidator.java_  (lines 38-39)

Edited to add validation logic to the isValid method to check for minimum inventory:

- added new logic to check for min value of remaining Parts when decrementing Product inventory for a purchase
- Added new error messages using ConstraintValidatorContext to provide custom error messages within **isValid** method
  "Insufficient inventory for part: [part name]"

```
public class EnufPartsValidator implements ConstraintValidator<ValidEnufParts, Product> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidEnufParts constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Product product, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        ProductService repo = myContext.getBean(ProductServiceImpl.class);
        if (product.getId() != 0) {
            Product myProduct = repo.findById((int) product.getId());
            for (Part p : myProduct.getParts()) {
                if (p.getInv()<(product.getInv()-myProduct.getInv()))
                {
                    constraintValidatorContext.disableDefaultConstraintViolation();
                    constraintValidatorContext.buildConstraintViolationWithTemplate("Insufficient inventory for part: " + p.getName()).addConstraintViolation();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}


```

MODIFY _filename: Product.java_

Add 2 lines of code to apply validator to Product classes

line 20 + import statement
```
import com.example.demo.validators.ValidEnufParts;
...
@ValidEnufParts

```

**•  Display error messages when adding and updating parts if the inventory is greater than the maximum.**

2 NEW files
_filename: ValidMaximum.java_ lines 1-25

```
package com.example.demo.validators;

import com.example.demo.validators.MaximumValidatorParts;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MaximumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaximum {
    String message() default "Part count is above set maximum";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}

```

_filename: MaximumValidator.java_ lines 1-31

```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MaximumValidator implements ConstraintValidator<ValidMaximum, Part> {
    @Autowired
    private ApplicationContext context;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMaximum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}

```

MODIFING domain model class files to apply maximum validator

_filename: Part.java_  line 3

```
import.com.example.demo.validators.PartsValidMaximum;
...
line 21: @ValidMaximum
```

Ensure Error Messages will display on part and product forms

MODIFY _filename: InhousePartForm.html_  lines 32-36
MODIFY _filename: OutsourcedPartForm.html_    lines 33-37

to display error messages within the POST section of this HTML form

```
*InhousePartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>
    
    
*OutsourcedPartForm

<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>

```

*******************

**I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.**

MODIFY _filename: PartTest_

added code lines 161 - 196
to create 4 unit test for the getter and setter methods for Minimum & Maximum inventory within the Part class

```
   @Test
    void getMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void setMinInv() {
        int min_inv=5;
        partIn.setMinInv(min_inv);
        assertEquals(min_inv,partIn.getMinInv());
        partOut.setMinInv(min_inv);
        assertEquals(min_inv,partOut.getMinInv());
    }

    @Test
    void getMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int max_inv=195;
        partIn.setMaxInv(max_inv);
        assertEquals(max_inv,partIn.getMaxInv());
        partOut.setMaxInv(max_inv);
        assertEquals(max_inv,partOut.getMaxInv());
    }

```
*******************

**J.  Remove the class files for any unused validators in order to clean your code.**

DELETED unused validator:

_filename: DeletePartValidator.java_

_filename: ValidDeletePart.java_
#   D 2 8 7 - J a v a - F r a m e w o r k s 
 
 #   D 2 8 7 - J a v a - F r a m e w o r k s 
 
 #   D 2 8 7 - J a v a - F r a m e w o r k s 
 
 