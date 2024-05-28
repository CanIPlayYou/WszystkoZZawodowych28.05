using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp1
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public string eyesColor;
        public bool isSomethingChecked = false;

        public MainWindow()
        {
            InitializeComponent();
        }

        private void numerTextbox_LostFocus(object sender, RoutedEventArgs e)
        {
            string numberFromTextBox = numerTextbox.Text;
            if(numberFromTextBox == "000" || numberFromTextBox == "111" || numberFromTextBox == "333")
            {
                personImage.Source = new BitmapImage(new Uri(@"/images/" + numberFromTextBox + "-zdjecie.jpg", UriKind.Relative));
                fingerPrintImage.Source = new BitmapImage(new Uri(@"/images/" + numberFromTextBox + "-odcisk.jpg", UriKind.Relative));
            }

        }

        private void okButton_Click(object sender, RoutedEventArgs e)
        {
            if(imieTextbox.Text != "" && nazwiskoTextbox.Text != "" && isSomethingChecked)
            {
                string testToMessegeBox = imieTextbox.Text + " " + nazwiskoTextbox.Text + ", Kolor oczu: " + eyesColor;

                MessageBox.Show(testToMessegeBox, "", MessageBoxButton.OK);
            }
            else
            {
                MessageBox.Show("Wprowadź dane", "", MessageBoxButton.OK);
            }
            
        }

        private void RadioButton_EyesColor_Checked(object sender, RoutedEventArgs e)
        {
            RadioButton radioButton = sender as RadioButton;
            switch(radioButton.Content.ToString())
            {
                case "niebieskie":
                    eyesColor = "Niebieski";
                    isSomethingChecked = true;
                    break;
                case "zielone":
                    eyesColor = "Zielony";
                    isSomethingChecked = true;
                    break;
                case "piwne":
                    eyesColor = "Piwny";
                    isSomethingChecked = true;
                    break;
            }
        }
    }
}
