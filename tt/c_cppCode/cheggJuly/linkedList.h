//linkedList.h
#ifndef LINKED_LIST_H
#define LINKED_LIST_H
struct employee* append(struct employee* listHead, struct employee* emp);
struct employee* search(struct employee* listHead, char* name);
void clearList(struct employee* listHead);
#endif //LINKED_LIST_H
