/**
 *
 * @author Hamzah Quadri
 *         Michael Huang
 */
import java.util.*;

public class Tester 
{
    public static void main(String[] args) 
    {
        Converter c = new Converter();

        while(true)
        {
            System.out.println("1. Instruction to Hex");
            System.out.println("2. Hex to Intsruction");
            System.out.println("3. Done");
            
            System.out.print("Please enter 1, 2 or 3 to choose your option: ");
            
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            
            if(x == 1)
            {
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Input a MIPS instruction: ");
                
                String y = scanner.nextLine();
                
                String[] tokens = y.split(" ");
                
                String l = tokens[0];
                String type = "";
                String op = "";  
                String funct = "";
                                
                for(int i = 0; i < c.HEX_MIPS_TABLE.length; i++)
                {
                   if(l.equals(c.HEX_MIPS_TABLE[i][0]))
                   {
                       type = c.HEX_MIPS_TABLE[i][1];
                       op = c.HEX_MIPS_TABLE[i][2];
                       funct = c.HEX_MIPS_TABLE[i][3];
                   }
                }
                
                if(type.equalsIgnoreCase("R_TYPE"))
                {
                    if(tokens.length > 4)
                    {
                    String a = hex2Bin(funct);                    
                    String b = tokens[4];
                    String d = tokens[2];
                    String e = tokens[3];
                    String f = tokens[1];
                   
                    String z = "";
                    String u = "";
                    String w = "";
                    String r = "";
                    f = hex2Bin(f);
                    
                    StringBuilder sham = new StringBuilder();

                    for(int i = f.length(); i < 5; i++)
                    {
                        sham.append("0");
                    }
                    
                    String shamt = sham.toString() + f;
                    shamt = bin2Hex(shamt);
                    
                    StringBuilder opc = new StringBuilder();

                    for(int i = op.length(); i < 6; i++)
                    {
                        opc.append("0");
                    }
                    
                    String special = opc.toString() + op;
                    
                    special = bin2Hex(special);
                                                                                             
                    StringBuilder builder = new StringBuilder();

                    for(int i = a.length(); i < 6; i++)
                    {
                        builder.append("0");
                    }
                    
                    String q = builder.toString() + a;
                    
                    if(!(b.startsWith("$")) || !(d.startsWith("$")) || !(e.startsWith("$")))
                    {
                        d = "$" + d;
                        b = "$" + b;
                        e = "$" + e;
                    }
                    
                    for(int i = 0; i < c.REGISTERS.length; i++)
                    {
                       if(d.equals(c.REGISTERS[i][0]))
                       {
                           u = c.REGISTERS[i][1];
                       }
                       
                       if(b.equals(c.REGISTERS[i][0]))
                       {
                           z = c.REGISTERS[i][1];
                       }
                       
                       if(e.equals(c.REGISTERS[i][0]))
                       {
                           w = c.REGISTERS[i][1];
                       }
                    }
                    
                    u = hex2Bin(u);
                    z = hex2Bin(z);
                    w = hex2Bin(w);
                    
                    StringBuilder builder2 = new StringBuilder();

                    for(int i = u.length(); i < 5; i++)
                    {
                        builder2.append("0");
                    }
                    
                    u = builder2.toString() + u;
                    
                    StringBuilder builder3 = new StringBuilder();

                    for(int i = z.length(); i < 5; i++)
                    {
                        builder3.append("0");
                    }
                                        
                    z = builder3.toString() + z;
                    
                    StringBuilder builder4 = new StringBuilder();

                    for(int i = w.length(); i < 5; i++)
                    {
                        builder4.append("0");
                    }
                                        
                    w = builder3.toString() + w;
                    
                    String bin = special + u + w + z + f + q;
                                        
                    String hex = bin2Hex(bin);
                    hex = "0x0" + hex;
                                        
                    System.out.println(l + " " + shamt + " " + e + " " + b + " " + d + " " + special);
                    System.out.println("Binary: " + bin);
                    System.out.println("Hex: " + hex);
                    System.out.println();
                    }
                    
                    else
                    {
                    String a = hex2Bin(funct);                    
                    String b = tokens[1];
                    String d = tokens[2];
                    String e = tokens[3];
                   
                    String z = "";
                    String u = "";
                    String w = "";
                    String r = "";
                    
                    StringBuilder opc = new StringBuilder();

                    for(int i = op.length(); i < 6; i++)
                    {
                        opc.append("0");
                    }
                    
                    String special = opc.toString() + op;
                                                                                             
                    StringBuilder builder = new StringBuilder();

                    for(int i = a.length(); i < 6; i++)
                    {
                        builder.append("0");
                    }
                    
                    String q = builder.toString() + a;
                    
                    if(!(b.startsWith("$")) || !(d.startsWith("$")) || !(e.startsWith("$")))
                    {
                        d = "$" + d;
                        b = "$" + b;
                        e = "$" + e;
                    }
                    
                    for(int i = 0; i < c.REGISTERS.length; i++)
                    {
                       if(d.equals(c.REGISTERS[i][0]))
                       {
                           u = c.REGISTERS[i][1];
                       }
                       
                       if(b.equals(c.REGISTERS[i][0]))
                       {
                           z = c.REGISTERS[i][1];
                       }
                       
                       if(e.equals(c.REGISTERS[i][0]))
                       {
                           w = c.REGISTERS[i][1];
                       }
                    }
                    
                    u = hex2Bin(u);
                    z = hex2Bin(z);
                    w = hex2Bin(w);
                    
                    StringBuilder builder2 = new StringBuilder();

                    for(int i = u.length(); i < 5; i++)
                    {
                        builder2.append("0");
                    }
                    
                    u = builder2.toString() + u;
                    
                    StringBuilder builder3 = new StringBuilder();

                    for(int i = z.length(); i < 5; i++)
                    {
                        builder3.append("0");
                    }
                                        
                    z = builder3.toString() + z;
                    
                    StringBuilder builder4 = new StringBuilder();

                    for(int i = w.length(); i < 5; i++)
                    {
                        builder4.append("0");
                    }
                                        
                    w = builder3.toString() + w;
                    
                    String bin = special + u + w + z + "00000" + q;
                                        
                    String hex = bin2Hex(bin);
                    hex = "0x0" + hex;
                                        
                    System.out.println(l + " " + b + " " + d + " " + e);
                    System.out.println("Binary: " + bin);
                    System.out.println("Hex: " + hex);
                    System.out.println();
                    }
                }
                
                else if(type.equalsIgnoreCase("I_TYPE"))
                {
                    String a = hex2Bin(op);                    
                    String b = tokens[1];
                    String d = tokens[2];
                    String e = tokens[3];
                   
                    String r = "";
                    String z = "";
                    String u = "";
                    
                    if(e.startsWith("0x"))
                    {
                        r = e.substring(2, e.length());
                    }
                    
                    r = hex2Bin(r);
                                                            
                    StringBuilder builder = new StringBuilder();

                    for(int i = a.length(); i < 6; i++)
                    {
                        builder.append("0");
                    }
                    
                    if(!(d.startsWith("$")) || !(b.startsWith("$")))
                    {
                        d = "$" + d;
                        b = "$" + b;
                    }
                    
                    for(int i = 0; i < c.REGISTERS.length; i++)
                    {
                       if(d.equals(c.REGISTERS[i][0]))
                       {
                           u = c.REGISTERS[i][1];
                       }
                       
                       if(b.equals(c.REGISTERS[i][0]))
                       {
                           z = c.REGISTERS[i][1];
                       }
                    }
                    
                    u = hex2Bin(u);
                    z = hex2Bin(z);
                    
                    StringBuilder builder2 = new StringBuilder();

                    for(int i = u.length(); i < 5; i++)
                    {
                        builder2.append("0");
                    }
                    
                    u = builder2.toString() + u;
                    
                    StringBuilder builder3 = new StringBuilder();

                    for(int i = z.length(); i < 5; i++)
                    {
                        builder3.append("0");
                    }
                                        
                    z = builder3.toString() + z;
                    
                    String bin = builder.toString() + a + u + z + r;
                                        
                    String hex = bin2Hex(bin);
                    hex = "0x" + hex;
                    
                    System.out.println();
                    
                    System.out.println(l + " " + b + " " + d + " " + e);
                    System.out.println("Binary: " + bin);
                    System.out.println("Hex: " + hex);
                    System.out.println();
                }
                
                else if(type.equalsIgnoreCase("J_TYPE"))
                {
                    String a = hex2Bin(op);                    
                    String b = tokens[1];
                    String r = "";
                    String z = "";
                    
                    if(b.startsWith("0x"))
                    {
                        r = b.substring(2, b.length());
                    }
                    
                    r = hex2Bin(r);
                    
                    StringBuilder builder = new StringBuilder();

                    for(int i = r.length(); i < 26; i++)
                    {
                        builder.append("0");
                    }
                    
                    z = builder.toString() + r;
                    
                    StringBuilder builder2 = new StringBuilder();

                    for(int i = a.length(); i < 6; i++)
                    {
                        builder2.append("0");
                    }
                    
                    String bin = builder2.toString() + a + z;
                    
                    String hex = bin2Hex(bin);
                    hex = "0x0" + hex;
                    
                    System.out.println();
                   
                    System.out.println(l + " " + b);
                    System.out.println("Binary: " + bin);
                    System.out.println("Hex: " + hex);
                    System.out.println();
                }
                
                else
                {
                    System.out.println("You have entered an invalid command!");
                }
            }
            
            else if(x == 2)
            {
               boolean R = false;
               System.out.print("Input a hex number: ");
               String y = input.next();
               String z = "";
               String hex = y;
               
               if(y.length() == 10)
               {
                   y = y.substring(2, 10);
                   z = hex2Bin(y);
               }
               
               else
               {
                   z = hex2Bin(y);
               }
               
               String l = y.substring(6, 8);
               String rtype = "";
               
               for(int i = 0; i < c.HEX_MIPS_TABLE.length; i++)
               {
                   if(l.equals(c.HEX_MIPS_TABLE[i][3]))
                   {
                       rtype = c.HEX_MIPS_TABLE[i][0];
                       R = true;
                   }
               }
               
               StringBuilder builder = new StringBuilder();

               for(int i = z.length(); i < 32; i++)
               {
                   builder.append("0");
               }
               
               String r = builder.toString() + z;
               String n = "";
               String m = "";
               
               n = r.substring(0, 6);
               
               m = bin2Hex(n);
               
               String I = "";
               String J = "";
               String answer = "";
                       
               for(int i = 0; i < c.HEX_MIPS_TABLE.length; i++)
               {
                   if(m.equals(c.HEX_MIPS_TABLE[i][2]))
                   {
                       answer = c.HEX_MIPS_TABLE[i][0];
                       I = c.HEX_MIPS_TABLE[i][1];
                       J = c.HEX_MIPS_TABLE[i][1];
                   }
               }
               
               if(R)
               {
                   System.out.println();
                   
                   String special = r.substring(0, 6);
                   String k = r.substring(6, 11);
                   String t = r.substring(11, 16);
                   String u = r.substring(16, 21);
                   String shamt = r.substring(21, 26);
                   
                   special = bin2Hex(special);
                   shamt = bin2Hex(shamt);
                   k = bin2Hex(k);
                   t = bin2Hex(t);
                   u = bin2Hex(u);
                                      
                   for(int i = 0; i < c.REGISTERS.length; i++)
                   {
                       if(u.equals(c.REGISTERS[i][1]))
                       {
                           u = c.REGISTERS[i][0];
                       }
                       
                       if(t.equals(c.REGISTERS[i][1]))
                       {
                           t = c.REGISTERS[i][0];
                       }
                       
                       if(k.equals(c.REGISTERS[i][1]))
                       {
                           k = c.REGISTERS[i][0];
                       }
                   }
                   
                   if(!(special.equals("0")) || !(shamt.equals("0")))
                   {
                       System.out.println(rtype + " " + shamt + " " + u + " " + k + " " + t + " " + special);
                   }
                   
                   else
                   {
                       System.out.println(rtype + " " + u + " " + k + " " + t);
                   }
                   
                   System.out.println("Binary: " + r);
                   System.out.println("Hex: " + hex);
                   System.out.println();
               }
               
               else if(I.equals("I_TYPE"))
               {
                   System.out.println();
                   
                   String k = r.substring(16, 32);
                   String t = r.substring(6, 11);
                   String u = r.substring(11, 16);
                   
                   k = bin2Hex(k);
                   t = bin2Hex(t);
                   u = bin2Hex(u);
                   k = "0x" + k;
                   
                   for(int i = 0; i < c.REGISTERS.length; i++)
                   {
                       if(u.equals(c.REGISTERS[i][1]))
                       {
                           u = c.REGISTERS[i][0];
                       }
                       
                       if(t.equals(c.REGISTERS[i][1]))
                       {
                           t = c.REGISTERS[i][0];
                       }
                   }
                   
                   System.out.println(answer + " " + u + " " + t + " " + k);
                   System.out.println("Binary: " + r);
                   System.out.println("Hex: " + hex);
                   System.out.println();    
               }
               
               else if(J.equals("J_TYPE"))
               {
                   System.out.println();
                   
                   String k = r.substring(6, 32);
                   k = bin2Hex(k);
                   k = "0x0" + k;
                   
                   System.out.println(answer + " " + k);
                   System.out.println("Binary: " + r);
                   System.out.println("Hex: " + hex);
                   System.out.println();
               }
               
               else
               {
                   System.out.println("You have entered an invalid command!");
               }
            }
            
            else if(x == 3)
            {
                System.exit(0);
            }
            
            else
            {
                System.out.println("You have entered an invalid option");
            }
        }
    }
    
    public static String hex2Bin(String hex) 
    {
        int i = Integer.parseInt(hex, 16);
        String bin = Integer.toBinaryString(i);
        
        return bin;
    }
    
    public static String bin2Hex(String bin)
    {
        int decimal = Integer.parseInt(bin, 2);
        String hex = Integer.toString(decimal, 16);
        
        return hex;
    } 
}