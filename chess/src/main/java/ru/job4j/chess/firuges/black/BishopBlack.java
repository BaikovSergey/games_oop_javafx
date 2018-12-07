package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 * @author Sergey Baikov
 * @version $ 1 $
 * @since 04.12.18
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        boolean result = false;
        if (Math.abs(dest.x - source.x) == Math.abs(dest.y - source.y)) {
            result = true;
        }
        return result;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        if (!isDiagonal(source, dest)) {
           throw new ImpossibleMoveException("Ошибка : Эта фигура не может так ходить!");
        }
        Cell[] steps = new Cell[Math.abs(dest.x - source.x)];
        int deltaX = -1;
        int deltaY = -1;
        for (int i = 0; i < steps.length; i++) {
            steps[i] = ...;
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
