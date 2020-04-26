package Element.ConcreteElement;

import Element.MailClient;
import Visitor.MailClientVisitor;

public class ThunderbirdMailClient implements MailClient{
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println(" ThunderbirdClient: Sending mail");
    }
    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println(" ThunderbirdMailClient: Receiving mail");
    }
    @Override
    public boolean accept(MailClientVisitor visitor) {
       visitor.visit(this);
       return true;
    }
}