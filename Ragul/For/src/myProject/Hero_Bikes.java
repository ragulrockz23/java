package myProject;

public  class Hero_Bikes implements Bikes {
	//String Bike_Name;
	int Model;
	int Mileage;
	double Engine_Capacity;
	int Transmission;
	double Fuel_Tank_Capacity;
	int Kerb_Weight;
	int Seat_Height;

	

	
	public Hero_Bikes(int Model,int Mileage,double Engine_Capacity,int Transmission,double Fuel_Tank_Capacity,int Kerb_Weight,int Seat_Height)  {
		//this.Bike_Name=Bike_Name;
		this.Model=Model;
		this.Mileage=Mileage;
		this.Engine_Capacity=Engine_Capacity;
		this.Transmission=Transmission;
		this.Fuel_Tank_Capacity=Fuel_Tank_Capacity;
		this.Kerb_Weight=Kerb_Weight;
		this.Seat_Height=Seat_Height;
		
	}




	public int getModel() {
		return Model;
	}




	public void setModel(int model) {
		Model = model;
	}




	public int getMileage() {
		return Mileage;
	}




	public void setMileage(int mileage) {
		Mileage = mileage;
	}




	public double getEngine_Capacity() {
		return Engine_Capacity;
	}




	public void setEngine_Capacity(double engine_Capacity) {
		Engine_Capacity = engine_Capacity;
	}




	public int getTransmission() {
		return Transmission;
	}




	public void setTransmission(int transmission) {
		Transmission = transmission;
	}




	public double getFuel_Tank_Capacity() {
		return Fuel_Tank_Capacity;
	}




	public void setFuel_Tank_Capacity(double fuel_Tank_Capacity) {
		Fuel_Tank_Capacity = fuel_Tank_Capacity;
	}




	public int getKerb_Weight() {
		return Kerb_Weight;
	}




	public void setKerb_Weight(int kerb_Weight) {
		Kerb_Weight = kerb_Weight;
	}




	public int getSeat_height() {
		return Seat_Height;
	}




	public void setSeat_height(int seat_height) {
		Seat_Height = seat_height;
	}




	@Override
	public void Hero_Bikes(int Model, int Mileage, double Engine_Capacity, int Transmission, double Fuel_Tank_Capacity,
			int Kerb_Weight, int Seat_Height) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void Yamaha_Bikes() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String toString() {
		return "Hero_Bikes [Model=" + Model + ", Mileage=" + Mileage + ", Engine_Capacity=" + Engine_Capacity
				+ ", Transmission=" + Transmission + ", Fuel_Tank_Capacity=" + Fuel_Tank_Capacity + ", Kerb_Weight="
				+ Kerb_Weight + ", Seat_Height=" + Seat_Height + "]";
	}
	

}
