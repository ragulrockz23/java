package StringLearing;

import java.util.Objects;

public class Mobile implements Comparable{

		@Override
		public int hashCode() {
			return Objects.hash(capacity, model, name, pixel, price);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Mobile other = (Mobile) obj;
			return capacity == other.capacity && model == other.model && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(pixel) == Double.doubleToLongBits(other.pixel) && price == other.price;
		}



		private String name;
		private int price;
		private int model;
		private int capacity;
		private double pixel;
		
		public Mobile(String name, int price, int model, int capacity, double pixel) {
			super();
			this.name = name;
			this.price = price;
			this.model = model;
			this.capacity = capacity;
			this.pixel = pixel;
		}

		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getModel() {
			return model;
		}


		public void setModel(int model) {
			this.model = model;
		}


		public int getCapacity() {
			return capacity;
		}


		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}


		public double getPixel() {
			return pixel;
		}


		public void setPixel(double pixel) {
			this.pixel = pixel;
		}
		
		

		@Override
		public String toString() {
			return "Mobile [name=" + name + ", price=" + price + ", model=" + model + ", capacity=" + capacity + ", pixel="
					+ pixel + "]";
		}


		
		// sorting by name
		/*
		 * @Override public int compareTo(Mobile o) {
		 * 
		 * return this.getName().compareTo(o.getName()); }
		 */
		
		//sorting by price
		 @Override public int compareTo(Object o) {
			 
			  Mobile oo = (Mobile)o;
			 if( this.getPrice()> oo.getPrice()) {
				 return 1;
			 }
			 else if( this.getPrice()< oo.getPrice()) {
				 return -1;
			 }
			 else 
				 return 0;
		 }
	


}
