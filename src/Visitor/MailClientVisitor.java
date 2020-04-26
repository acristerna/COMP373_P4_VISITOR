package Visitor;

import Element.ConcreteElement.GmailMailClient;
import Element.ConcreteElement.OutlookMailClient;
import Element.ConcreteElement.ThunderbirdMailClient;

public interface MailClientVisitor {
    void visit(OutlookMailClient mailClient);
    void visit(GmailMailClient mailClient);
    void visit(ThunderbirdMailClient mailClient);
}