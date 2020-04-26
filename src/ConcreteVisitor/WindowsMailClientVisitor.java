package ConcreteVisitor;

import Element.ConcreteElement.GmailMailClient;
import Element.ConcreteElement.OutlookMailClient;
import Element.ConcreteElement.ThunderbirdMailClient;
import Visitor.MailClientVisitor;

// import guru.springframework.gof.visitor.structure.SquirrelMailClient;
//import guru.springframework.gof.visitor.structure.ZimbraMailClient;

public class WindowsMailClientVisitor implements MailClientVisitor{
    @Override
    public void visit(OutlookMailClient mailClient) {
        System.out.println("Configuration of Outlook mail client for Windows complete");
    }
    @Override
    public void visit(GmailMailClient mailClient) {
        System.out.println("Configuration of Gmail mail client for Windows complete");
    }
    @Override
    public void visit(ThunderbirdMailClient mailClient) {
        System.out.println("Configuration of Thunderbird mail client for Windows complete");
    }
}