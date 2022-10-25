using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YoutubeDemo
{
    class Program
    {
        static void Main(string[] args)
        {


           

            //int[] sayilar1 = new[] { 1, 2, 3 };
            //int[] sayilar2 = new[] { 10, 20, 30 };
            //sayilar1 = sayilar2;
            //sayilar2[0] = 1000;
            //Console.WriteLine(sayilar1[0]);
            //Console.ReadLine();

            CreditManager creditManager = new CreditManager();
            creditManager.Calculate();
            creditManager.Seve();


            Costumer costumer = new Costumer(); //örneğini oluşturmak, instance oluşturmak
            //costumer.Id = 1;
            //costumer.FirstName = "Filiz";
            //costumer.LastName = "Karaöz";
            //costumer.NationalIdentity = "123456";
            //costumer.City = "Karabük";

            CostumerManager costumerManager = new CostumerManager(costumer);
            costumerManager.Save();
            costumerManager.Delete();

            Company company = new Company();
            company.TaxNumber = "100000";
            company.CompanyName = "Arçelik";
            company.Id = 100;

            CostumerManager costumerManager2 = new CostumerManager(new Person());
            //costumerManager.Save(costumer);

            Person person = new Person();
            person.FirstName = "";
            person.NationalIdentity = "";

            Costumer c1 = new Costumer();
            Costumer c2 = new Person();
            Costumer c3 = new Company();

            Console.ReadLine();

        }

        class CreditManager
        {
            public void Calculate()
            {
                Console.WriteLine("Hesaplandı");
            }

            public void Seve()
            {
                Console.WriteLine("Kredi verildi");
            }

        }

        //SOLID
        class Costumer
        {
            public Costumer()
            {
                Console.WriteLine("Müşteri nesnesi başlatıldı");
            }
            public int Id { get; set; }
            public string City { get; set; }
        }

        class Person : Costumer
        {
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdentity { get; set; }

        }

        class Company : Costumer
        {
            public string CompanyName { get; set; }
            public string TaxNumber { get; set; }
        }

        // katmanlı mimari
        class CostumerManager
        {
            private Costumer _costumer;
            public CostumerManager(Costumer costumer)
            {
                _costumer = costumer;
            }

            public void Save()
            {
                Console.WriteLine("Müşteri Kaydedildi");
            }

            public void Delete()
            {
                Console.WriteLine("Müşteri Silindi");
            }
        }
    }
}



