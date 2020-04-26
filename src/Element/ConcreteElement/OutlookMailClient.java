package Element.ConcreteElement;

import Element.MailClient;
import Visitor.MailClientVisitor;

public class OutlookMailClient implements MailClient{
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println(" OutlookMailClient: Sending mail");
    }
    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println(" OutlookMailClient: Receiving mail");
     }
    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}