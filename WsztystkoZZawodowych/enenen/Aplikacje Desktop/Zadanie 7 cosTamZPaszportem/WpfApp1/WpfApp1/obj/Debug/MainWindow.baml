   M S B A M L   `   `   `  ����B  >WpfApp1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	       WpfApp1.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	     � Title$>  8Wprowadzenie danych do paszportu. Wykonał: 000000000000��5   	   $	��450��6I   $	��800��6V   ���#5F9EA0.��5	      �  � ColumnDefinitions 5
   
   �� 5      $��* �6   �� 5      $��* �6   .+�5   
   � $��0��6    � RowDefinitions 5      �� 5      $��* �6    �� 5      $��* �6    .+�5      �� $��Imię��6   $
��Left=�6#   $��	32,92,0,0q�6>   $	��Top=�6Q   �� 5      $��Numer��6   $
��Left=�6$   $��	32,40,0,0q�6?   $	��Top=�6R   �� 5      $��Nazwisko��6   $
��Left=�6'   $��
32,147,0,0q�6B   $	��Top=�6V   �� 5      -   5         ��Name$ numerTextbox��5      ���#F0FFFF$
��Left=�6A   $��
183,48,0,0q�6\    �� TextWrapping$
 Wrap=�6p   $�� ��6�   $	��Top=�6�   $	��186��6�   6�   �� 5      -   5        $ imieTextbox��5      ���#F0FFFF$
��Left=�6@   $��	183,0,0,0q�6[   $
 Wrap=�6n   $�� ��6�   $��Center=�6�   $	��186��6�   �� 5      -   5        $ nazwiskoTextbox��5      ���#F0FFFF$
��Left=�6D   $��183,155,0,0q�6_   $
 Wrap=�6t   $�� ��6�   $	��Top=�6�   $	��186��6�   �� 5      $��
Kolor oczu��6   ���#5F9EA0 K� ZIndex$ 1��6>   $
��Left=�6O   $��	32,16,0,0q�6j   $��1��6}   $	��Top=�6�   �� 5      
������� �� CornerRadius$ 5��6)   $��350px��6:   $��150px��6H   $��2q�6W   $��1��6k   ._�5      �� $��20q�6   .+�5       	� -   5        $��0, 10, 0 , 10q�5    "   $��
niebieskie��69    d� 	IsChecked$
 TrueY�6v   	� 5!      -   5        $��0, 10, 0 , 10q�5!   "   $��zielone��69   6K   	� 5"      -   5        $��0, 10, 0 , 10q�5"   "   $��piwne��69   6I   5#      5$      5(      �� 5+   
   -   5         ��Name$ personImage��5+      $��1��6%   $
��Left=�65   $	��180��6P   $��
44,106,0,0q�6]   $	��Top=�6q   $��/images/000-zdjecie.jpg��6�   �� 5,   
   -   5        $ fingerPrintImage��5,      $��1��6*   $
��Left=�6:   $	��180��6U   $��249,106,0,0q�6b   $	��Top=�6w   $��/images/000-odcisk.jpg��6�   �� 5.   
   -	   5        	 ��Name$	 okButton��5.      $��1��6#   $��OK��63   ���#F0FFFF$
��Left=�6U   $��
44,335,0,0q�6p   $	��Top=�6�   $��61��6�   $	��325��6�   6�   50      51      