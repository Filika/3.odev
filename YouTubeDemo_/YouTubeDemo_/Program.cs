using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeDemo_
{
    class Program
    {
        static void Main(string[] args)
        {

            //IoC Container
            CostumerManager costumerManager = new CostumerManager(new Costumer(), new TeacherCreditManager());
            costumerManager.GiveCredit();
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
        interface ICreditManager
        {
            void Calculate();
            void Save();
        }

        abstract class BaseCreditManager : ICreditManager
        {
            public abstract void Calculate();

            public virtual void Save()
            {
                Console.WriteLine("Kaydedildi");
            }
        }

        class TeacherCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Öğretmen kredisi hesaplandı");
            }
            public override void Save()
            {
                base.Save();
            }

        }

        class MilitaryCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Asker kredisi hesaplandı");
            }

        }

        class CarCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Araba kredisi hesaplandı");
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
            private ICreditManager _creditManager;
            public CostumerManager(Costumer costumer, ICreditManager creditManager)
            {
                _costumer = costumer;
                _creditManager = creditManager;
            }

            public void Save()
            {
                Console.WriteLine("Müşteri Kaydedildi");
            }

            public void Delete()
            {
                Console.WriteLine("Müşteri Silindi");
            }

            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi verildi");

            }
        }

    }
}

