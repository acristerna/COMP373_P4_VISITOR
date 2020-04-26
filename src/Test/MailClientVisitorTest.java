package Test;

import org.junit.Before;
import org.junit.Test;

import ConcreteVisitor.LinuxMailClientVisitor;
import ConcreteVisitor.MacMailClientVisitor;
import ConcreteVisitor.WindowsMailClientVisitor;
import Element.ConcreteElement.GmailMailClient;
import Element.ConcreteElement.OutlookMailClient;
import Element.ConcreteElement.ThunderbirdMailClient;

import static org.junit.Assert.*;

public class MailClientVisitorTest {
   private MacMailClientVisitor macVisitor;
   private LinuxMailClientVisitor linuxVisitor;
   private WindowsMailClientVisitor windowsVisitor;
   private OutlookMailClient outlookMailClient;
   private GmailMailClient gmailMailClient;
   private ThunderbirdMailClient thunderbirdMailClient;
   
    @Before
    public void setup(){
    macVisitor = new MacMailClientVisitor();
    linuxVisitor = new  LinuxMailClientVisitor();
    windowsVisitor = new WindowsMailClientVisitor();
    outlookMailClient = new OutlookMailClient();
    gmailMailClient = new GmailMailClient ();
    thunderbirdMailClient = new ThunderbirdMailClient();
    }
    
    @Test
     public void testOutlookMailClient() throws Exception {
        System.out.println("--Testing Outlook Mail Client--");
        assertTrue(outlookMailClient.accept(macVisitor));
        assertTrue(outlookMailClient.accept(linuxVisitor));
        assertTrue(outlookMailClient.accept(windowsVisitor));
    }
    @Test
    public void testGmailMailClient() throws Exception {
        System.out.println("\n--Testing Gmail Mail Client--");
        assertTrue(gmailMailClient.accept(macVisitor));
        assertTrue(gmailMailClient.accept(linuxVisitor));
        assertTrue(gmailMailClient.accept(windowsVisitor));
    }
    @Test
    public void testThunderbirdMailClient() throws Exception {
        System.out.println("\n--Testing Thunderbird Mail Client--");
        assertTrue(thunderbirdMailClient.accept(macVisitor));
        assertTrue(thunderbirdMailClient.accept(linuxVisitor));
        assertTrue(thunderbirdMailClient.accept(windowsVisitor));
    }
}