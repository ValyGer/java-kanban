package manager;

import task.Epic;
import task.Subtask;
import task.Task;

import java.util.ArrayList;
import java.util.List;

public interface TaskManager {

    // Обработка task
    Task createTask(Task task);
    ArrayList<Task> getAllTasks();
    void removeAllTasks();
    Task getTaskById(Integer id);
    void removeTaskById(Integer id);
    void updateTask(Task task);

    // Обработка epic
    Epic createEpic(Epic epic);
    ArrayList<Epic> getAllEpics();
    void removeAllEpics();
    Epic getEpicById(Integer id);
    void removeEpicById(Integer id);
    void updateEpic(Epic epic);
    void updateEpicTime(Subtask subtask);
    void updateEpicStatus(Subtask subtask);
    ArrayList<Subtask> getListSubtaskInEpic(Integer id);


    // ОБработка subtask
    Subtask createSubtask(Subtask subtask);
    ArrayList<Subtask> getAllSubtasks();
    void removeAllSubtasks();
    void removeSubtaskById(Integer id);
    Subtask getSubtaskById(Integer id);
    void updateSubtask(Subtask subtask);
    List<Task> getHistory();
}