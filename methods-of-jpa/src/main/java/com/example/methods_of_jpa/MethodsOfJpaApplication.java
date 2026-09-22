package com.example.methods_of_jpa;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor 
public class MethodsOfJpaApplication {
	private  final ProductRepository productRepository;
	private final OrdersService ordersService;


	public static void main(String[] args) {
		SpringApplication.run(MethodsOfJpaApplication.class, args);
	}

	@Bean 
	public CommandLineRunner commandLineRunner(){
		return  args->{
			Product product=Product.builder()
			.productName("Iphone 17 pro max")
			.productBrand("Apple")
			.productPrice(18000000.99)
			.build();


			//SAVE
		// Product savedProduct=productRepository.save(product);
		// System.out.println("saved product is "+savedProduct);
		// };

		//SAVEALL
		// productRepository.saveAll(getProducts());

		//COUNT
		// long tatalProducts=productRepository.count();
		// System.out.println("total no of products is "+tatalProducts);

		//EXISTS &
		// Product iphone17=productRepository.findById(1).orElseThrow();
		// boolean isIphoneExists=productRepository.existsById(1);
		// System.out.println("is exists i phone 17"+isIphoneExists);


		// Product existingProduct=productRepository.findById(1).orElseThrow();
		// boolean isIphoneExists2=productRepository.exists(Example.of(existingProduct));
		// System.out.println("is phone 17  present"+isIphoneExists2);


		//Delete &DeleteByid
		//   productRepository.deleteById(9);
		//   List<Product>products=productRepository.findAll();
		//   productRepository.deleteAll(products);
		//   productRepository.delete();


		// List<Product>products=productRepository.findAll(Sort.by(Direction.DESC,"ProductName"));
		// products.forEach(System.out::println);

		//  Page<Product>products=productRepository.findAll(PageRequest.of(0, 5,
		// 	Direction.DESC,"productId"));
		//  System.out.println("page information is "+products);
		//  //pageNumber->0 base indexing 
		//  //pageSize->number of data inside the page
		//  products.forEach(System.out::println);




		//Update
		// var iphone17=productRepository.findById(11).orElseThrow();
		// iphone17.setProductBrand("iphone 20");
		// productRepository.save(iphone17);


	// Optional<Product> optGalaxy=	productRepository.findByProductName("Galaxy S26");
	// System.out.println(optGalaxy.orElseThrow());

	// Product optGalaxy=	productRepository.findByProductName("Galaxy S26").orElseThrow();->or else writing this

	productRepository.findAllByProductPriceBetween(10000, 50000)
	                                              .forEach(System.out::println);


     productRepository
	 .findAllByProductPriceGreaterThanEqual(12000,Sort.by(Direction.ASC,"productPrice"))
	 .forEach(System.out::println);


	//  Optional<Product> findbyProductname=productRepository.findByProductNameAndProductBrand("product-3", "brand-3");
	//  System.out.println(findbyProductname);->or else write

	// productRepository.findByProductNameAndProductBrand("product-3", "brand-3").ifPresent(p->System.out.println(p));


	// productRepository.getProduct("product5", "brand5")
	// .ifPresent(p->System.out.println(p));

	// int affectedRow=productRepository.updatePrice(7, 800);
	// System.out.println("no of affected row"+affectedRow);

  ordersService.placeOrder(1, 30);





	};
}

	private List<Product> getProducts(){
	return	IntStream.range(1, 10).mapToObj(i -> Product.builder()
	                          .productName("product"+i)
							.productBrand("brand"+i)
						      .productPrice(10000 * i)
							.build())
							.toList();
	}

	

}
