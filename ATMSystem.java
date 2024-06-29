import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.ArrayList; 
import java.util.Date; 
import java.util.List; 
public class ATMSystem extends JFrame 
{ 
private JTextField withdrawField; 
private JTextField depositField; private 
JLabel balanceLabel; private double 
balance = 75000.0; private List<String> 
transactionHistory;
public ATMSystem() 
{ 
super("ATM Management System"); 
transactionHistory = new ArrayList<>(); 
// Create components 
JLabel withdrawLabel = new JLabel("Withdraw Amount:"); withdrawField = new JTextField(10); 
JButton withdrawButton = new JButton("Withdraw"); 
JLabel depositLabel = new JLabel("Deposit Amount:"); 
depositField = new JTextField(10); 
JButton depositButton = new JButton("Deposit"); 
JButton transactionButton = new JButton("Transaction History"); balanceLabel = new JLabel("Balance: $" + balance); 
// Add components to content pane 
JPanel panel = new JPanel(new FlowLayout()); 
panel.add(withdrawLabel); 
panel.add(withdrawField); 
panel.add(withdrawButton); 
panel.add(depositLabel); 
panel.add(depositField); 
panel.add(depositButton); 
panel.add(transactionButton); 
panel.add(balanceLabel); add(panel); 
// Add action listener to withdraw button withdrawButton.addActionListener(new 
ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
withdraw(); 
} 
}); 
depositButton.addActionListener(new ActionListener() 
{ 
@Override 
public void actionPerformed(ActionEvent e) 
{ 
deposit(); 
} 
}); 
// Add action listener to transaction history button 
transactionButton.addActionListener(new ActionListener() 
{ 
@Override public void 
actionPerformed(ActionEvent e) 
{ 
showTransactionHistory(); 
} 
}); 
} 
private void withdraw() 
{ 
try 
{ 
double amount = Double.parseDouble(withdrawField.getText()); 
if (amount <= 0) 
{ 
JOptionPane.showMessageDialog(this, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE); 
} else if (amount > balance) 
{ 
JOptionPane.showMessageDialog(this, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE); 
} 
else 
{ 
balance -= amount; 
balanceLabel.setText("Balance: $" + balance); 
String transaction = "Withdrawal: -$" + amount + " [" + new Date() + "]"; 
transactionHistory.add(transaction); 
JOptionPane.showMessageDialog(this, "Withdrawal successful!", "Success", JOptionPane.INFORMATION_MESSAGE); 
} 
} 
catch (NumberFormatException ex)
{ 
JOptionPane.showMessageDialog(this, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE); 
} 
} 
private void deposit() 
{ 
try 
{ 
double amount = Double.parseDouble(depositField.getText());
 if (amount <= 0) 
{ 
JOptionPane.showMessageDialog(this, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE); 
} 
else 
{
 balance += amount; 
balanceLabel.setText("Balance: $" + balance); 
String transaction = "Deposit: +$" + amount + " [" + new Date() + "]"; 
transactionHistory.add(transaction); 
JOptionPane.showMessageDialog(this, "Deposit successful!", "Success", JOptionPane.INFORMATION_MESSAGE); 
} 
} catch (NumberFormatException ex) 
{ 
JOptionPane.showMessageDialog(this, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE); 
} 
} 
private void showTransactionHistory() 
{ 
StringBuilder history = new StringBuilder(); 
for (String transaction : transactionHistory) 
{ 
history.append(transaction).append("\n"); 
} 
JOptionPane.showMessageDialog(this, history.toString(), "Transaction History", JOptionPane.INFORMATION_MESSAGE); 
}
 public static void main(String[] args) 
{ 
ATMSystem atm = new ATMSystem(); 
atm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
atm.setSize(400, 200); atm.setVisible(true);
}
} 