import React from 'react';
import Styles from '../src/css/style.module.css'
import Header from './components/Header';
import Navigation from './components/Navigation';
import Advertisement from './components/Advertisement';
import Main from './components/Main';
import SubContents from './components/SubContents';
function App() {
  return (
    <div className={Styles.div}>
      <Header />
      <div className={Styles.mid}>
        <Navigation/>
        <Main>
          <div className={Styles.mmain}>
            <SubContents/>
            <SubContents/>
            <SubContents/>  
          </div>  
          <Advertisement/>
        </Main>  
      </div>
    </div>
  );
}
                
export default App;