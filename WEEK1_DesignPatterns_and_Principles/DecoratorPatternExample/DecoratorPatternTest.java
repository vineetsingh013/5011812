public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier emailAndSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Sending email notification:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending email and SMS notification:");
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending email, SMS, and Slack notification:");
        emailAndSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}