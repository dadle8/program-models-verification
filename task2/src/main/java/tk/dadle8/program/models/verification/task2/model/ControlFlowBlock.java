package tk.dadle8.program.models.verification.task2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ControlFlowBlock {
    private int id;
    private ControlFlowBlock next;
    private ControlFlowBlock branch;
    private List<String> text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ControlFlowBlock)) return false;
        ControlFlowBlock that = (ControlFlowBlock) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id# " + id + '\n'
                + String.join("\n", text) + '\n'
                + "next# " + getNextId() + '\n'
                + "branch# " + getBranchId();
    }

    private String getNextId() {
        return next == null ? "" : Integer.toString(next.getId());
    }

    private String getBranchId() {
        return branch == null ? "" : Integer.toString(branch.getId());
    }
}
