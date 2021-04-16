package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {

//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar tidak harus pusing");
        todoListRepository.data[1] = new TodoList("Santai pelan-pelan");
        todoListRepository.data[2] = new TodoList("Abis itu diulang-ulang lagi biar mantep");
        todoListRepository.data[3] = new TodoList("Kalau udah cape, tidur lah");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar tidak harus pusing");
        todoListService.addTodoList("Santai pelan-pelan");
        todoListService.addTodoList("Abis itu diulang-ulang lagi biar mantep");
        todoListService.addTodoList("Kalau udah cape, tidur lah");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar tidak harus pusing");
        todoListService.addTodoList("Santai pelan-pelan");
        todoListService.addTodoList("Abis itu diulang-ulang lagi biar mantep");
        todoListService.addTodoList("Kalau udah cape, tidur lah");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }

}
