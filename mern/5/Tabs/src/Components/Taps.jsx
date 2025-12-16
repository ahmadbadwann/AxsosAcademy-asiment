import { useState } from "react";

export default function Taps({ tabs }) {
  const [activeIndex, setActiveIndex] = useState(0);

  const handleTabClick = (index) => {
    setActiveIndex(index);

    
    if (tabs[index].onClick) {
      tabs[index].onClick();
    }
  };

  return (
    <div className="tabs-container">
      <div className="tabs-headers">
        {tabs.map((tab, index) => (
          <button
            key={index}
            className={`tab-btn ${activeIndex === index ? "active" : ""}`}
            onClick={() => handleTabClick(index)}
          >
            {tab.label}
          </button>
        ))}
      </div>

      <div key={activeIndex} className="tabs-content">
        {tabs[activeIndex].content}
      </div>
    </div>
  );
}
