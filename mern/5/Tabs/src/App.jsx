import './App.css'
import Taps from './Components/Taps'

function App() {

  const tabsData = [
    {
      label: "Home",
      content: <p>Welcome to Home tab</p>,
      onClick: () => console.log("Home clicked"),
    },
    {
      label: "Profile",
      content: <p>This is your profile</p>,
    },
    {
      label: "Settings",
      content: <p>Settings content here</p>,
      onClick: () => alert("Settings opened"),
    },
  ];

  return (
    <div>
      <h2>Tabs Example</h2>
      <Taps tabs={tabsData} />
    </div>
  );
}

export default App;
