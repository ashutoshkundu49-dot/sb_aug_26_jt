import { useEffect, useState } from "react";
import ExpenseForm from "./components/ExpenseForm";
import ExpeseForm from "./components/ExpenseForm";
import { ExpenseList } from "./components/ExpenseList";
import { Footer } from "./components/Footer";
import Header from "./components/Header";
import Summary from "./components/Summary";
import axios from "axios";
import expenseService from "./services/expenseService";

export default function App(){
  const [expenses,setExpenses]=useState([])
  const [editingExpense,setEditingExpense]=useState(null)
   const getExpenses=async ()=>{
        try{

        
        const response=await expenseService.getExpenses()
        // console.log("data is ",response.data);
        setExpenses(response.data)
        }catch(err){
            console.log("some Error occurred ",err);
            
        }
        
    }
      useEffect(()=>{
      getExpenses()
    },[])

  return (
    <div className=' min-h-screen bg-gray-100'>
    <Header/>
    <main className="max-w-4xl mx-auto  py-4 mt-4 ">
      <ExpenseForm getExpenses={getExpenses}
       editingExpense={editingExpense}
        setEditingExpense={setEditingExpense}
        />
      <Summary expenses={expenses}/>
      <ExpenseList expenses={expenses}
       getExpenses={getExpenses}
        setEditingExpense={setEditingExpense}/>
    </main>

    <Footer/>
    </div>
  )
}