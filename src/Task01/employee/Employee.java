package Task01.employee;


import Task01.entity.Person;

public class Employee extends Person {
        private String empId;
        private String position;

        public Employee(String name,String idCard,String empId,String position){

            super(name,idCard);
            this.empId=empId;
            this.position=position;

        }

        protected String getEmpId()
        {
            return empId;
        }

        protected  String getPosition(){
            return position;
        }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: "+empId+",Position: "+position);
    }
}



