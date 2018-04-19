package cheggoct;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
 
 
 
public class TextBox
{
 
JTextArea jta;
JTextArea jtf;
JFrame jf;
 
JPanel jp1, jp2, jp3, jp4, main;
 
JCheckBox wc;
JCheckBox cc;
JCheckBox vc;
 
JRadioButton sm;
JRadioButton med;
JRadioButton lar;
 
Font smF;
Font medF;
Font larF;
 
JScrollPane scrollPaneTa;
JScrollPane scrollPaneTf;
 
ButtonGroup group;
 
String res = "";
 
 
 
 
TextBox()
{
group = new ButtonGroup();
 
smF = new Font("serif", Font.PLAIN,5);
medF = new Font("serif", Font.PLAIN,10);
larF = new Font("serif", Font.PLAIN,20);
 
jf = new JFrame();
 
jp1 = new JPanel();
jp2 = new JPanel();
jp3 = new JPanel();
jp4 = new JPanel();
main = new JPanel();
 
jta = new JTextArea(10, 20);
 
wc = new JCheckBox("Word Count");
cc = new JCheckBox("Character Count");
vc = new JCheckBox("Vowel Count");
 
sm = new JRadioButton("Small");
med = new JRadioButton("Medium");
lar = new JRadioButton("Large");
 
jtf = new JTextArea(6, 20);
 
group.add(sm);
group.add(med);
group.add(lar);
 
jta.setEditable(true);
 
scrollPaneTa = new JScrollPane(jta);
scrollPaneTf = new JScrollPane(jtf);
main.setLayout(new GridLayout(2,2));
 
jp1.add(jta);
jp2.add(jtf);
jp3.add(sm);
jp3.add(med);
jp3.add(lar);
jp4.add(wc);
jp4.add(cc);
jp4.add(vc);
 
main.add(jp1);
main.add(jp2);
main.add(jp3);
main.add(jp4);
 
jf.add(main);
jf.setSize(800, 400);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
 
 
sm.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{jta.setFont(smF);}});
 
med.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{jta.setFont(medF);}});
 
lar.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{jta.setFont(larF);}});
 
wc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{wordCount(jta.getText());jtf.setText(res);}});
 
cc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{characterCount(jta.getText());jtf.setText(res);}});
 
vc.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{vowelCount(jta.getText());jtf.setText(res);}});}
void wordCount(String st)
{int wCounter = 1;for(int c = 0; c < st.length(); c++)
{
if(st.charAt(c) == ' ')
wCounter++;
}
res += "\n Number of words: " + wCounter;
}
void characterCount(String st)
{
int cCounter = 0;
for(int c = 0; c < st.length(); c++)
{
cCounter++;
}
res += "\n Number of characters: " + cCounter;
}
void vowelCount(String st)
{
int vCounter = 0;
for(int c = 0; c < st.length(); c++)
{
if
 
(st.charAt(c) == 'a' || st.charAt(c) == 'A'
|| st.charAt(c) == 'e' || st.charAt(c) == 'E'
|| st.charAt(c) == 'i' || st.charAt(c) == 'I'
|| st.charAt(c) == 'o' || st.charAt(c) == 'O'
|| st.charAt(c) == 'u' || st.charAt(c) == 'U')
vCounter++;
}
res += "\n Number of vowels: " + vCounter;
}
public static void main(String[] args)
{
new TextBox();
}
}