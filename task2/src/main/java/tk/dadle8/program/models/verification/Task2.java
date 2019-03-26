package tk.dadle8.program.models.verification;

import guru.nidi.graphviz.attribute.Label;
import guru.nidi.graphviz.attribute.RankDir;
import guru.nidi.graphviz.attribute.Shape;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;

import java.io.File;
import java.io.IOException;

import static guru.nidi.graphviz.model.Factory.*;

public class Task2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Task2");

        Graph g = graph("example1").directed()
                .graphAttr().with(RankDir.LEFT_TO_RIGHT)
                .with(
                        node("a").with(Shape.RECTANGLE).link(node("b")),
                        node("b").link(node("c").with(Label.lines("a = b;", "a > b"))),
                        node("c").link(node("a"))
                );
        Graphviz.fromGraph(g).height(100).basedir(new File("C:/.")).render(Format.PNG).toFile(new File("task2/out/out.png"));
    }
}