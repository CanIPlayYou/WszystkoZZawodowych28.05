import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';

function App() {
  return (
    <div className="App">
      <MainView/>
    </div>
  );
}

function MainView(){
  return(
    <div className='d1'>
      <h1>Rezerwacja lotu</h1>

      <form>
        <div className='form-group'>
          <label htmlFor='NameInput'>Imię i Nazwisko:</label>
          <input type='text' className='form-control' id='NameInput'/>

          <label htmlFor='emailInput'>Email:</label>
          <input type='email' className='form-control' id='emailInput'/>

          <label htmlFor='selectInput'>Wybierz lot:</label>
          <select className='form-control' id='selectInput'>
            <option>Wybierz lot</option>
            <option>Nowy Jork - 10:00 (4300zł)</option>
            <option>Londyn - 12:00 (400zł)</option>
            <option>Tokio - 16:00 (7600zł)</option>
          </select>

          <label htmlFor='numberInput'>Liczba biletów: </label>
          <input type='number' className='form-control' id='numberInput'/>

          <button type='button' className='btn btn-primary' onClick={btnOnClick} >Zarezerwuj</button>
        </div>
      </form>

      <h1>Informacje o rezerwacji: </h1>

      <div className='rezerBox'>
        <h2 id='rezerwacjaLotuText'></h2>

        <p id='rezerwacjaPomyslnieLubNie'></p>

        <p id='imieNazwiskoP'></p>
        <p id='emailP'></p>
        <p id='liczbaBiletowP'></p>
        <p id='kosztP'></p>
      </div>

    </div>
  );
}

function btnOnClick(){
  var imieNazwisko = document.getElementById("NameInput").value;
  var emailInputValue = document.getElementById("emailInput").value;
  var selectInputValue = document.getElementById("selectInput").value;
  var numberOfTicketsValue = document.getElementById("numberInput").value;

  //var rezerBox = document.getElementById("rezerBox").style;
  var rezerwacjaLotuTextP = document.getElementById("rezerwacjaLotuText");
  var rezerwacjaPomyslnieLubNie = document.getElementById("rezerwacjaPomyslnieLubNie");

  var imieNazwiskoP = document.getElementById("imieNazwiskoP");
  var emailP = document.getElementById("emailP");
  var liczbaBiletowP = document.getElementById("liczbaBiletowP");
  var kosztP = document.getElementById("kosztP");


  var ticketPrice = 0;
  if(selectInputValue == "Nowy Jork - 10:00 (4300zł)"){
    ticketPrice = 4300;
  }
  else if(selectInputValue == "Londyn - 12:00 (400zł)"){
    ticketPrice = 400;
  }
  else if(selectInputValue == "Tokio - 16:00 (7600zł)"){
    ticketPrice = 7600;
  }

  if(imieNazwisko != "" && emailInputValue != "" && selectInputValue != "Wybierz lot" && (numberOfTicketsValue != "" && numberOfTicketsValue != 0)){
    //rezerBox.backgroundColor = "#008000";
    rezerwacjaLotuTextP.textContent = "Rezerwacja lotu";
    
    rezerwacjaPomyslnieLubNie.textContent = "Twoja rezerwacja przebiegła pomyślnie!";
    
    imieNazwiskoP.textContent = "Imię: "+ imieNazwisko;
    emailP.textContent = "Email: "+ emailInputValue;
    liczbaBiletowP.textContent = "Liczba biletów: "+ numberOfTicketsValue;
    kosztP.textContent = "Całkowity koszt: "+ (ticketPrice*numberOfTicketsValue);

    //console.log("dziala");
  }
  else{
    rezerwacjaLotuTextP.textContent = "Rezerwacja lotu";
    rezerwacjaPomyslnieLubNie.textContent = "Rezerwacja nieudana!";

    imieNazwiskoP.textContent = "";
    emailP.textContent = "";
    liczbaBiletowP.textContent = "";
    kosztP.textContent = "";
  } 

  //        
}

export default App;
