package l1;


public abstract class P {

	public static void main(String[] args) {
		
		
		Person stud = new Student("akbar","sms sent to");
		stud.awake();
		System.out.println(stud.notif());

	}
	
	public static abstract class Person {
		
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public abstract String notif();
		
		public void awake() {
			System.out.println(this.name + " Time to wakeup");
		}
		
	}
	
	public static class Student extends Person{
		
		private String sms;
		
		
		public String getSms() {
			return sms;
		}


		public void setSms(String sms) {
			this.sms = sms;
		}


		public Student(String name, String sms) {
			super(name);
			this.sms = sms;
		}
		
		
		@Override
		public String notif() {
			return this.sms + " " + super.name;
		}
		
	}
	
	public static class Teacher extends Person{
		
		private String call;
		
		public String getCall() {
			return call;
		}

		public void setCall(String call) {
			this.call = call;
		}

		public Teacher(String name, String call) {
			super(name);
			this.call = call;
		}
		
		public String notif() {
			return super.name + " " + this.call;
		}
		
		
		public static class Manager extends Person{
			
			public Manager(String name) {
				super(name);
			}
			
			public String notif() {
				return super.name + " " + "come";
			}
		
	}
	
	}

}
