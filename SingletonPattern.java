// ����ʽ����
class HungerSingletonPattern
{
	private static HungerSingletonPattern a_incetance = new HungerSingletonPattern();
	private HungerSingletonPattern() {}
	public static HungerSingletonPattern getInstance() {
		return a_incetance;
	}
}

// ����ʽ����
class LazySingletonPattern
{
	private static LazySingletonPattern a_incedtance = null;
	private LazySingletonPattern() {}
	synchonized public static LazySingletonPattern getIncetance() {
		if(a_incedtance == null) {
			a_incedtance = new LazySingletonPattern();
		}
		return a_incedtance;
	}
}
