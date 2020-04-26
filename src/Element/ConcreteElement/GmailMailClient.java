package Element.ConcreteElement;

import Element.MailClient;
import Visitor.MailClientVisitor;


public class GmailMailClient implements MailClient{
  
	@Override
    public void sendMail(String[] mailInfo) {
        System.out.println(" GmailMailClient: Sending mail");
    }
    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println(" GmailMailClient: Receiving mail");
    }
    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}