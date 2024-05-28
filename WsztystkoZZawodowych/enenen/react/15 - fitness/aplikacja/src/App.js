import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';

var dateNumber = null;

function App() {
  /*  const [buttons, updateButtons] = useState([{id:1,"desc":""}, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]);

  
function btnOnClick(){
  var imieNazwisko = document.getElementById("NameInput").value;;
  var selectValue = document.getElementById("selectInput").value;
  var dayNumberValue = document.getElementById("dayInput");

  if(dateNumber != null && imieNazwisko != "" && selectValue != "Naciśnij, aby wybrać zajęcia"){
    console.log(imieNazwisko + ",\n" + selectValue + ",\nData: "+ dateNumber +".05.2024");
    let newDate = buttons;
    newDate[0].desc = "dsfgf";
    updateButtons(newDate);
  }
  else{
    alert("Wprowadź dane...");
  }
}

function dateBtnClick(dd){
  dateNumber = dd;

  var dayNumberValue = document.getElementById("dayInput");

  dayNumberValue.placeholder = "Data: "+ dateNumber +".05.2024";
} */
  const button = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31];

  return (
    <div className="App">
      <div className='navBar'>
        <h1>Zapisy na fitness</h1>
      </div>

      <div className='mainForDivs'>
        <div className='inputsDiv'>
          <p className='helperText'>Wprowadź dane</p>

          <form>
            <div className='form-group'>
              <label htmlFor='NameInput'>Podaj imię i nazwisko:</label>
              <input type='text' className='form-control' id='NameInput'/>

              <label htmlFor='selectInput'>Wybierz zajęcia:</label>
              <select className='form-control' id='selectInput'>
                <option>Naciśnij, aby wybrać zajęcia</option>
                <option>Bieganie</option>
                <option>Joga</option>
                <option>Aerobik</option>
                <option>Pilates</option>
              </select>

              <label htmlFor='numberInput'>Dzień rezerwacji: </label>
              <input type='number' className='form-control' id='dayInput' placeholder='Wybierz date po prawej stronie... ' disabled/>

              <button type='button' className='btn btn-secondary' onClick={btnOnClick} >Zarezerwuj</button>
            </div>
          </form>
        </div>

        <div className='calendarDiv'>
          <div className='monthName'>
            <h1>Maj</h1>
          </div>

          <div className='daysInMonth'>
            {button.map(element => {
              return <button type='button' className='calendaryBtns' id={element} onClick={() => dateBtnClick(element)}>{element}</button>
            })}
          </div>
        </div>
      </div>
      
    </div>
  );
}

function btnOnClick(){
  var imieNazwisko = document.getElementById("NameInput").value;;
  var selectValue = document.getElementById("selectInput").value;
  var dayNumberValue = document.getElementById("dayInput");

  if(dateNumber != null && imieNazwisko != "" && selectValue != "Wybierz zajęcia"){
    alert(imieNazwisko + ",\n" + selectValue + ",\nData: "+ dateNumber +".05.2024");
  }
  else{
    alert("Wprowadź dane...");
  }
}

function dateBtnClick(dd){
  dateNumber = dd;

  var dayNumberValue = document.getElementById("dayInput");

  dayNumberValue.placeholder = "Data: "+ dateNumber +".05.2024";
}

export default App;
