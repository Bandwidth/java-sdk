package com.bandwidth.sdk.model.bxml.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Allows for convenient finding of enums based on custom enum fields.
 *
 * @param <E> the type of the enum
 */
public class EnumFinder<E extends Enum<E>> {

    private final List<E> enums;

    public EnumFinder(Class<E> enumClass) {
        this.enums = Arrays.asList(enumClass.getEnumConstants());
    }

    /**
     * Finds an {@code Optional} enum based on a {@code Predicate}.
     * <p>Example: {@code find(thing -> thing.code == code)}</p>
     * Note: Finds the first enum that matches the predicate using the order the enums are declared in.
     *
     * @param predicate the predicate to match the enum against
     * @return the {@code Optional} enum matching the predicate
     */
    public Optional<E> findOptional(Predicate<? super E> predicate) {
        return enums.stream().filter(predicate).findFirst();
    }

    /**
     * Finds an enum based on a {@code Predicate} that must match otherwise an {@code IllegalArgumentException} will be
     * thrown.
     *
     * @param predicate the predicate to match the enum against
     * @return the enum matching the predicate
     * @throws IllegalArgumentException thrown if predicate doesn't match
     * @see #find(Predicate)
     * @see #findOptional(Predicate)
     */
    public E findRequired(Predicate<? super E> predicate) {
        return findOptional(predicate).orElseThrow(IllegalArgumentException::new);
    }

    /**
     * Finds an enum based on a {@code Predicate}.
     *
     * @param predicate the predicate to match the enum against
     * @return the enum matching the predicate, {@code null} if no match
     * @see #findRequired(Predicate)
     * @see #findOptional(Predicate)
     */
    public E find(Predicate<? super E> predicate) {
        return findOptional(predicate).orElse(null);
    }

    /**
     * Convenience method to create an enum finder with less generics mess.
     *
     * <p>{@code AnEnum anEnum = EnumFinder.of(AnEnum.class).find(e -> e.code == code).orElse(null)}
     *
     * @param enumClass the type of the enum
     * @return the enum finder
     */
    public static <T extends Enum<T>> EnumFinder<T> of(Class<T> enumClass) {
        return new EnumFinder<>(enumClass);
    }
}
