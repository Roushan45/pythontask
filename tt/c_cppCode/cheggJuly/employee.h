//employee.h
#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#define MAX_NAME_LEN 15
#define MAX_NUM_EMPLOYEES 10
/*PUT YOUR STRUCT DEFINITION HERE*/
typedef struct employee{
    char name[MAX_NAME_LEN];
    int id;
    float netIncome;
    float taxes;
    struct employee* next;
};
struct employee* buildEmployeeList(char* filename);
void writeSalaryInfoToFile(struct employee* listHead, char* filename);

#endif //EMPLOYEE_H
