	package cheggmarch;
	
	public class Okra extends Plant implements Edible{
		private String name,group,taste;
		public Okra(){
			
		}
		public Okra(String name,String group,String taste){
			super(name,group);
			this.name=name;
			this.taste=taste;
			this.group=group;
		}
		
		@Override
		public String getTaste() {
			
			return taste;
		}
	
		@Override
		public String getName() {
			
			return name;
		}
	
		@Override
		public String getGroup() {
			
			return group;
		}
	
	}
