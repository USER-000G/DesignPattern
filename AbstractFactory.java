interface AbstractFactory 
{
	Product1 getProduct1();
	product2 getProduct2();
}

interface Product1
{
	void method1();
	void method2();
}

interface Product2
{
	void method1();
	void method2();
}

class ConcreteAbstractFactory implements AbstractFactory
{
	Product1 getProduct1() {
		return new ConcreteProduct1();
	}
	product2 getProduct2() {
		return new ConcreteProduct2();
	}
}

class ConcreteProduct1 implements Product1
{
	void method1() {}
	void method2() {}
}

class ConcreteProduct2 implements Product2
{
	void method1() {}
	void method2() {}
}

class AbstractFactoryDemo
{
	AbstractFactory concreteAbstractFactory = new ConcreteAbstractFactory();
	Product1 concreteProduct1 = concreteAbstractFactory.getProduct1();
	Product2 concreteProduct2 = concreteAbstractFactory.getProduct2();
	// 业务代码...
	concreteProduct1.method1();
	ConcreteProduct2.method1();
}