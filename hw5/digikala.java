package hw5;

import java.util.List;

public class digikala {

	public static void main(String[] args) {

		
		Category category1 = new Category(1, "arayeshi");
		Category category2 = new Category(2, "house");
		Category category3 = new Category(3, "laptop");
		Category category4 = new Category(4, "mobile");
		
		List<Category> categories = List.of(category1,category2,category3,category4);
		
		List<Product> products = List.of(
				new Product(1, "asus-tuf", category3, true) ,
				new Product(2, "lenovo", category3, false),
				new Product(3, "asus-rog", category3, false),
				new Product(4, "iphone16", category4, false),
				new Product(5, "tv", category2, false),
				new Product(6, "mobl", category2, false),
				new Product(7, "mesvak", category1, false),
				new Product(8, "s22", category4, true));
		
		
		
		

	}
	
	
	
	public static class Category {
		
		private int id;
		private String name;
		
		public Category(int id, String name) {

			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + "]";
		}
		
	}
		public static class Product {
			
			private int id;
			private String name;
			private Category category;
			private boolean off;
			
			public Product(int id, String name, Category category, boolean off) {

				this.id = id;
				this.name = name;
				this.category = category;
				this.off = off;
				
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Category getCategory() {
				return category;
			}

			public void setCategory(Category category) {
				this.category = category;
			}

			public boolean isOff() {
				return off;
			}

			public void setOff(boolean off) {
				this.off = off;
			}

			@Override
			public String toString() {
				return "Product [id=" + id + ", name=" + name + ", category=" + category + ", off=" + off + "]";
			}
			
		}
			
			public static class DigiKalaService{
				
				private List<Category> categories; 
				private List<Product> products;
				
				public DigiKalaService(List<Category> categories, List<Product> products) {

					this.categories = categories;
					this.products = products;
				}

				public List<Category> getCategories() {
					return categories;
				}

				public List<Category> getCategories(String name) {
					return categories.stream()
							.filter(t -> t.getName().contains(name))
							.toList();
				}
				
				
				public List<Product> getProducts() {
					return products;
				}
				
				public List<Product> getProducts(String name) {
					return products.stream()
							.filter(t -> t.getName().contains(name))
							.toList();
				}
				
				public List<Product> getProducts(Category category) {
					return products.stream()
							.filter(t -> t.category.getId()== category.getId())
							.toList();
				}
				
				public List<Product> getProducts(Category category, String name) {
					return products.stream()
							.filter(t -> t.category.getId()== category.getId())
							.filter(t -> t.getName().contains(name))
							.toList();
				}
				
			}
			
			
	
}






