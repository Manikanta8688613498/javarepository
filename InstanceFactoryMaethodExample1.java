class Account
{
int accountNumber=12345;
double balance=10000.0;
public void transact()
{
System.out.println("Bank transaction");
}
}
class AccountFactory
{
public static Account createAccount()
{
Account ac=new Account();
return ac;
}
}
public class StaticFactoryMaethodExample2
{
public static void main(String[] args)
{
Account ac=AccountFactory.createAccount();
System.out.println(ac);
System.out.println(ac.accountNumber);
ac.transact();
}
}