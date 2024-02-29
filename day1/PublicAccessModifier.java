package week2.day1;

public class PublicAccessModifier {

	public void publicaccessLevel() {

		System.out.println("This is from Public Access Modifier");
	}

	private void privateAccessLevel() {

		System.out.println("This is Private Access Modifier");
	}

	protected void protectedAccessModifier() {

		System.out.println("This is from Protected Access Modifier");
	}

	void defaultAccessModifier() {

		System.out.println("This is from Default Access Modifier");

	}

	public static void main(String[] args) {

		PublicAccessModifier acc = new PublicAccessModifier();
		acc.publicaccessLevel();
		acc.privateAccessLevel();
		acc.protectedAccessModifier();
		acc.defaultAccessModifier();
	}

}
