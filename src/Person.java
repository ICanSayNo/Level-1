
public class Person {
	String name="Jeff";
	String superpower="can be extremely lazy";
	public static void main(String[] args) {
		Person jeff = new Person();
		String name=jeff.getName();
		String Newname=jeff.setName("JERREH");
		String superpower=jeff.getName();
		String newSuperpower=jeff.setName("JERREH");
	}
	public String getName(){
			return name;
		}
	public String setName(String setName){
		return setName;
	}
	public String getSuperpower(){
			return name;
		}
	public String setSuperpower(String setSuperpower){
		return setSuperpower;
	}
}
