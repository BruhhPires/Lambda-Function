package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		//INSTANCIA O METODO COM A EXPRESSÃO LAMBDA
		
		//FUNÇÃO "map", é uma função que aplica uma função a todos elementos de uma stream.
		//CONVERSÃO - 1 -> List para stream = .stream()
		//CONVERSÃO - 2 -> Stream para list = .collect(Collectors.toList())
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		// RETORNARÁ UMA LISTA "names" // STREAM PRA CRIAR // MAP PARA APLICAR A FUNÇÃO NOS ELEMENTOS // VARIAVEL DA FUNÇÃO // Collectors.toList RETORNA PARA LISTA 
		names.forEach(System.out::println);
	
		}
	}


