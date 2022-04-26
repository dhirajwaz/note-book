package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionExample {
//	static int a=10;
//	static int b=20;
//	static String str="i have nothing to say you";
	public static void main(String []args) {
		
		//Example 1 normal 
//		 Drawable d=new Drawable(){  
//	            public void draw(){
//	            	System.out.println(width);
//	            	}  
//	        };  
		
		//Example 2 with lambda expression
//		Drawable d=(a, b)->(a+b);
//			System.out.println(d.draw(a, b));  
		
		//Example 3
//		Drawable d=()->{
//			return str;
//		};
//		System.out.println(d.draw());
		
		//Example 4
//		Drawable d=(str)->{
//			return str;
//		};
//		System.out.println(d.draw("hello"));
		
		//example 5
//		List<String> list=new ArrayList();
//		list.add("ram");
//		list.add("Shayam");
//		list.add("rahul");
//		System.out.println(list);
//		list.forEach((n)->System.out.println(n));
		
		//Example 6
//		List<Product> list=new ArrayList<Product>();  
//        list.add(new Product(1,"HP Laptop",25000f));  
//        list.add(new Product(3,"Keyboard",300f));  
//        list.add(new Product(2,"Dell Mouse",150f)); 
//        
//         Collections.sort(list,(p1,p2)->{
//        	 return p1.name.compareTo(p2.name);
//         });
//         
//         list.forEach((n)->System.out.println(n.id+" "+n.name+" "+n.price));
        
//            for(Product p:list){  
//                System.out.println(p.id+" "+p.name+" "+p.price);  
//            } 
 
		//Example 7
//		List<Product> list=new ArrayList<Product>();  
//        list.add(new Product(1,"Samsung A5",17000f));  
//        list.add(new Product(3,"Iphone 6S",65000f));  
//        list.add(new Product(2,"Sony Xperia",25000f));  
//        list.add(new Product(4,"Nokia Lumia",15000f));  
//        list.add(new Product(5,"Redmi4 ",26000f));  
//        list.add(new Product(6,"Lenevo Vibe",19000f)); 
//        
//        Stream<Product>filtered_data =list.stream().filter(p->p.price >2000);
//        filtered_data.forEach((n)->System.out.println(n.id+" "+n.name+ "  " +n.price));
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
		//Filtering Collection without using Stream 
//        List<Float> price= productsList.stream()
//        		.filter(p->p.price > 30000)
//        		.map(p-> p.price)
//        		.collect(Collectors.toList());
//        System.out.println(price);
        
        //Java Stream Iterating Example
//        productsList.stream()
//        .filter(p->p.price == 30000)
//        .forEach(p-> System.out.println(p.name));
        
        //reduce() Method in Collection
//        Float total=productsList.stream()
//        		.map(p-> p.price)
//        		.reduce(0.0f, (sum,price)->sum+price);
//        System.out.println(total);
//        
//        Float total1=productsList.stream()
//        		.map(p-> p.price)
//        		.reduce(0.0f, (Float::max));
//        System.out.println(total1+ "hi");
        
        //count() Method in Collection
//        Long count=productsList.stream()
//        		.filter(p-> p.price < 30000)
//        		.count();
//        System.out.println(count);
        
        //Converting List to set means remove dublicate
//        Set<Float>setData=productsList.stream()
//        		.filter(p-> p.price < 30000)
//        		.map(p-> p.price)
//        		.collect(Collectors.toSet());
//        System.out.println(setData);
        
        //Converting in map
//        Map<Integer ,String> mapData=productsList.stream()
//        		.collect(Collectors.toMap(p-> p.id, p-> p.name));
//        System.out.println(mapData);
        
        //Method Reference in stream
//        List<Float> floatData=productsList.stream()
//        		.filter(p-> p.price < 30000)
//        		.map(p-> p.price)
//        		.collect(Collectors.toList());
//        System.out.println(floatData);
        
        //Java Stream filter() example
        productsList.stream()
        .filter(p-> p.price > 30000)
        .map(p-> p.price)
        .forEach(System.out::println);
	} 
		
	    }  

