import React, { useEffect, useState } from "react";
 
function TodoComponent() {
  const [text, setText] = useState("");
  const [tasks, setTasks] = useState(
    JSON.parse(localStorage.getItem("tasks")) || []
  );
 
  const submitHandler = (e) => {
    e.preventDefault();
    const t = { text, checked: false };
    setTasks([...tasks, t]);
    setText("");
  };
  const deleteItem = (task) => {
    setTasks(tasks.filter((el) => el != task));
  };
  const toggleCheck = (index) => {
    const newTasks = [...tasks];
    newTasks[index].checked = !newTasks[index].checked;
    setTasks(newTasks);
  };
  useEffect(() => {
    localStorage.setItem("tasks", JSON.stringify(tasks));
    console.log(localStorage.getItem("tasks"));
  }, [tasks]);
 
  return (
    <>
      <form
        action="#"
        className="flex gap-2 w-1/2 mx-auto mb-10"
        onSubmit={submitHandler}
      >
        <input
          type="text"
          placeholder="Add your task"
          className="bg-gray-200 text-black p-2 rounded w-full "
          value={text}
          onChange={(e) => setText(e.target.value)}
        />
        <button type="submit" className="bg-blue-500 text-white p-2 rounded ">
          Add
        </button>
      </form>
 
      <div>
        {tasks.map((el, index) => (
          <div className="flex gap-2 w-full justify-center mt-5 items-center">
            <p
              className={`text-white text-2xl ${
                el.checked ? "line-through" : ""
              }`}
              key={index}
            >
              {el.text}
            </p>
            <input
              type="checkbox"
              checked={el.checked}
              onClick={() => toggleCheck(index)}
              className="bg-blue-500 text-white p-2 rounded "
            />
            <button
              onClick={() => deleteItem(el)}
              className="bg-red-500 text-white p-2 rounded "
            >
              delete
            </button>
          </div>
        ))}
      </div>
    </>
  );
}

export default TodoComponent;