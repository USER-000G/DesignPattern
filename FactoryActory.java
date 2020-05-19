interface FactoryActory 
{
	<T extends Product> T factory(Class<T> c);
}

interface Product
{
	void method1();
	void method2();
}

class ConcreteFactory implements FactoryActory
{
	<T extends Product> T factory(Class<T> c) {
		Product product = null;
		try{
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}
}

class ConcreteProduct implements Product
{
	void method1() {
		
	}
	void method2() {
		
	}
}

class FactoryActoryDemo
{
	public static void main(String args[]) {
		FactoryActory factoryActory = new ConcreteFactory();
		Product product = factoryActory.factory(ConcreteProduct.class);
		// 业务代码
	}
}
